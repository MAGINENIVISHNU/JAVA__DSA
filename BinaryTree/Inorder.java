package DSA.BinaryTree;
import java.util.*;
class Bt{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static int idx=-1;
    public static Node build(int[] nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node nw=new Node(nodes[idx]);
        nw.left=build(nodes);
        nw.right=build(nodes);
        return nw;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
class Inorder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nodes=new int[n];
        for(int i=0;i<n;i++){
            nodes[i]=sc.nextInt();
        }
        Bt.Node t=Bt.build(nodes);
        Bt.inorder(t);
    }
}
