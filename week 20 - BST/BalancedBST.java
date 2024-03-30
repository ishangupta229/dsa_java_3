import java.util.ArrayList;

import ArraytoBST.BST;

public class BalancedBST {
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data= data;
        }
    }
    
    static class Binary_tree {
        static int idx = -1;
        public static node Binary_Tree(int [] n) {
            idx++;
            if (n[idx]==-1) {
                return null;
            }
            node newnode = new node(n[idx]);
            newnode.left = Binary_Tree(n);
            newnode.right = Binary_Tree(n);
            
            return newnode;
        }       
        
    }
    public static void inorder(node root, ArrayList <Integer> aList) {
        if (root==null ) return;

        inorder(root.left, aList);
        aList.add(root.data);
        inorder(root.right,aList);
        System.out.println(aList);
        return;
    }
    public static node BalancedBST(node root) {
        ArrayList <Integer> list = new ArrayList<>();
        inorder(root, list);

        return BST(list, 0, list.size()-1);
    }

    public static node BST(ArrayList <Integer> list, int s, int e) {
        if (s>e) {
            return null;
        }
        int mid = (s+e)/2;
        node newnode = new node(list.get(mid)) ;
        newnode.left = BST(list,s,mid-1);
        newnode.right = BST(list,mid+1,e);
        return newnode;
    }
    public static void main(String[] args) {
        int nodes [] = {8,6,5,3,-1,-1,-1,-1,10,-1,11,-1,12,-1,-1};

        Binary_tree tree = new Binary_tree();
        node root = tree.Binary_Tree(nodes);
        System.out.println(root.data);
        node root1 = BalancedBST(root);
        System.out.println(root1.data);
        System.out.println(root1.left.right.data);
    }
}