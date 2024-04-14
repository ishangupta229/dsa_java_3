import java.util.*;
public class intro {

    static class node {
        node arr[] = new node[26];
        boolean eow = false;
        
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
        }
        curr.eow=true;
    }

    public static boolean search(String word) {
        node curr = root;
        for (int i = 0; i < word.length(); i++) {
            if (curr.arr[word.charAt(i)-'a']==null) {
                return false;   
            }
            // if (i!=word.length()-1) {
            // }
            curr = curr.arr[word.charAt(i)-'a'];
        }
        if (curr.eow==false) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String word [] = {"the","a","there","their","any","thee"};

        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }

        System.out.println(search("a"));
        System.out.println(search("thor"));
        System.out.println(search("any"));
    }
}
