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
    static int idx=-1;
    public static Node build(int [] node){
        idx++;
        if(node[idx]==-1){
            return null;
        }
        Node nw=new Node(node[idx]);
        nw.left=build(node);
        nw.right=build(node);
        return nw;
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}
class Postorder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []node=new int[n];
        for(int i=0;i<n;i++){
            node[i]=sc.nextInt();
        }
        Bt.Node root=Bt.build(node);
        Bt.postorder(root);
    }
}
