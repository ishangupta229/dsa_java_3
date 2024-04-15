import java.util.*;
public class Largest_word {

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
    
    public static void larWord(node root , StringBuilder sb, StringBuilder ans) {
        if (root == null ) {
            System.out.println(ans);
            return;
        } 
        if (root.eow==false) {
            return;  
        }
        for(int i = 0 ; i<26; i++){
            if (root.arr[i]!= null && root.eow==true) {
                sb.append((char)(i+'a'));
                if (sb.length()>ans.length()) {
                    ans.append((char)(i+'a'));
                }
                larWord(root.arr[i],sb,ans);
                sb.setLength(sb.length()-1);
                
            }
        }
    }
    
    public static void main(String[] args) {
        String word [] = {"a","banana","app","appl","ap","apply","apple"};
        
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        
        root.eow=true;
        StringBuilder ans = new StringBuilder("");
        larWord(root,new StringBuilder(""),ans);
        System.out.println(ans);
    }   
}
