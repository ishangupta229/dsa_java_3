import java.util.*;
public class Unique_Subarray {

    static class node {
        node arr[] = new node[26];
        boolean eow = false;
        int freq = 0;
        node(){
            for (int i = 0; i < arr.length; i++) {
                arr[i]=null;
            }
        }
    }   

    static node root = new node();

    public static void insert(String word) {
        node curr = root;
        for (int i = 0; i < word.length(); i++) {
            if (curr.arr[word.charAt(i)-'a']==null) {
                curr.arr[word.charAt(i)-'a'] = new node();
            }
            curr = curr.arr[word.charAt(i)-'a'];
            curr.freq ++;
        }
        curr.eow=true;
    }

    public static boolean search(String word) {
        node curr = root;
        for (int i = 0; i < word.length(); i++) {
            if (curr.arr[word.charAt(i)-'a']==null) {
                return false;   
            }
            curr = curr.arr[word.charAt(i)-'a'];
        }
        if (curr.eow==false) {
            return false;
        }
        return true;
    }

    public static int count(node root) {
        if (root==null) {
            return 0;
        }
        int count=0;
        for(int i=0; i<26; i++)
        {
            if (root.arr[i]!= null)
            {
                count+= count(root.arr[i]);                
            }
        }
        
        return count +1;
        
    }

    public static void main(String[] args) {
        String word = "apple";

        for (int i = 0; i < word.length(); i++) {
            insert(word.substring(i));
        }

        System.out.println(count(root));;
        
    }
}
