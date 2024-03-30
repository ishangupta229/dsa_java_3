import java.util.ArrayList;

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
        public static void inorder(node root, ArrayList <Integer> aList) {
            if (root==null ) return;
    
            inorder(root.left, aList);
            aList.add(root.data);
            inorder(root.right,aList);
    
            return;
        }
    }
    public static void main(String[] args) {
        int nodes [] = {8,6,5,3,-1,-1,-1,-1,10,-1,11,-1,12,-1,-1};

        Binary_tree tree = new Binary_tree();
        node root = tree.Binary_Tree(nodes);
        System.out.println(root.data);

        inorder(root, new ArrayList<>());
    }
}