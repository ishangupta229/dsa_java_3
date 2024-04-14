import java.util.*;
public class Prefix_prob {

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

    public static void preFix(node root, StringBuilder ans) {

        if (root==null) {
            return;
        }
        if (root.freq==1) {
            System.out.println(ans);
            return;
        }
        
        for(int i=0; i<root.arr.length; i++){
            if (root.arr[i]!=null) {
                preFix(root.arr[i],ans.append((char)(i+'a')));
                ans.setLength(ans.length() -1);
            }
        }
    }

    public static void main(String[] args) {
        String word [] = {"zebra","dog","duck","dove"};

        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }

        preFix(root, new StringBuilder(""));
        
    }
}
