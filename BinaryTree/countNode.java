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
    public static Node build(int[] node){
        idx++;
        if(node[idx]==-1){
            return null;
        }
        Node nw=new Node(node[idx]);
        nw.left=build(node);
        nw.right=build(node);
        return nw;
    }
    public static int cnt(Node root){
        if(root==null){
            return 0;
        }
        int left=cnt(root.left);
        int right=cnt(root.right);
        return left+right+1;
    }
}
class countNode{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int node[]=new int[n];
        for(int i=0;i<n;i++){
            node[i]=sc.nextInt();
        }
        Bt.Node root=Bt.build(node);
        System.out.println(Bt.cnt(root));
    }
}
