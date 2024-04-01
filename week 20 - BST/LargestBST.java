import java.util.*;
public class LargestBST {
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
    static class info{
        int size;
        int max;
        int min;
        boolean ans;

        info(int size,int max,int min, boolean ans){
            this.size = size;
            this.max = max;
            this.min = min;
            this.ans = ans;
        }
    }
    public static int maxsize;
    public static info findingBST(node root) {
        if (root == null ) {
            return new info(0, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        }        

        info left = findingBST(root.left);
        info right = findingBST(root.right);
        
        int size = left.size + right.size + 1;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        if (root.data >= right.min || root.data <= left.max) {
            return new info(size, max, min, false);
        }
        if (left.ans && right.ans) {
            maxsize = size>maxsize ? size : maxsize;
            return new info(size, max, min, true);
        }
        return new info(size, max, min, false);
    }
    public static void main(String[] args) {
        int [] nodes = {50,30,5,-1,-1,20,-1,-1,60,45,-1,-1,70,65,-1,-1,80,-1,-1};
        Binary_Tree tree = new Binary_Tree();
        node root = tree.makeTree(nodes);
        
        findingBST(root);
        System.out.println(maxsize);
    }
}
