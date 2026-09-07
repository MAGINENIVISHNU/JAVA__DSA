package DSA.BinaryTree;
import java.util.Scanner;

class Bt{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node build(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=build(root.left, val);
        }
        if(root.data<val){
            root.right=build(root.right, val);
        }
        return root;
    }
    public static Boolean BST(Node root,int val){
        if(root ==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        else if(root.data>val){
            return BST(root.left, val);
        }else{
            return BST(root.right, val);
        }
    }
    public static void print(Node root){
        if(root==null){
            return;
        }
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
}
class BS_Tree{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int values[]=new int[n];
        for(int i=0;i<n;i++){
            values[i]=sc.nextInt();
        }
       Bt.Node root=null;
        for(int i=0;i<values.length;i++){
            root=Bt.build(root,values[i]);
        }
        Bt.print(root);
        int target=sc.nextInt();
        System.out.println(Bt.BST(root, target));
    }
}
