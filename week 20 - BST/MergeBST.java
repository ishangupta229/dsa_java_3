import java.util.*;
public class MergeBST {
    
    static int idx =-1;
    static class  node {
        int data;
        node left;
        node right;

        node(int data){
            this.data = data;
        }  
    } 
    static class Binary_Tree {
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
        public static void rest() {
            idx=-1;
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
    public static void inorderSeq(node root , ArrayList <Integer> list) {
        if (root == null) {
            return;
        }
        inorderSeq(root.left, list);
        list.add(root.data);
        inorderSeq(root.right, list);
           
    }
    public static node inTObst(ArrayList <Integer> list, int s, int e) {
        if (s>e) {
            return null;
        }

        int mid = (s+e)/2;
        node newnode = new node(list.get(mid));
        newnode.left = inTObst(list, s, mid-1);
        newnode.right = inTObst(list, mid+1 ,e);

        return newnode;
         
    }
    public static node merBST(node r1 , node r2) {
        ArrayList <Integer> l1 = new ArrayList<>();
        ArrayList <Integer> l2 = new ArrayList<>();
        ArrayList <Integer> l3 = new ArrayList<>();

        inorderSeq(r1, l1);
        inorderSeq(r2, l2);
        int i=0,j=0;
        while (i<l1.size() && j<l2.size()) {
            if (l1.get(i)>=l2.get(j)) {
                l3.add(l2.get(j++));
            }else{
                l3.add(l1.get(i++));
            }            
        }
        while (i<l1.size()) {
            l3.add(l1.get(i++));
        }
        while (j<l2.size()) {
            l3.add(l2.get(j++));
        }

        return inTObst(l3, 0, l3.size()-1);
        
    }
    public static void main(String[] args) {
        int [] nodes1 = {2,1,-1,-1,4,-1,-1};
        int [] nodes2 = {9,3,-1,-1,12,-1,-1};
        Binary_Tree tree1 = new Binary_Tree();
        node root1 = tree1.makeTree(nodes1);
        
        idx=-1;
        Binary_Tree tree2 = new Binary_Tree();
        node root2 = tree2.makeTree(nodes2);

        node root = merBST(root1, root2);
        ArrayList <Integer> list = new ArrayList<>();
        inorderSeq(root,list );
        System.out.println(list);
    }
}

