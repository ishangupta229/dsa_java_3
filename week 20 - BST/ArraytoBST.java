import java.util.*;

public class ArraytoBST {
    static class  node {
        int data;
        node left;
        node right;

        node(int data){
            this.data = data;
        }  
    } 
    static class Binary_Tree {
        static int idx =-1;
        public static node makeTree(int nodes[]) {
            idx++;
            if (nodes[idx]==-1) {
                return  null;              
            }

            node newnode = new node(nodes[idx]);
            
            newnode.left = makeTree(nodes);
            newnode.right = makeTree(nodes);

            return newnode;
        }
    }
    static class BST {
        static int idx=-1;
        public static node BST(int [] arry , int s, int e) {
            idx++;
            if (s>e) {
                return null;
            }
            int mid = e + (s-e)/2;
            node newnode = new node(arry[mid]);
            newnode.left = BST(arry,s,mid-1);
            newnode.right = BST(arry,mid+1,e);
            return newnode;
        }
        
    }
    
    public static void main(String[] args) {
        int nodes [] = {1,2,3,4,5,6,7,8,9};
        BST tree= new BST();
        node root = tree.BST(nodes, 0, nodes.length-1);

        System.out.println(root.data);
    }
}
