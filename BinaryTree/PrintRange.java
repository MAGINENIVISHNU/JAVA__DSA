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
    public static Node Build(Node root,int val){
        if(root==null){
            root =new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=Build(root.left, val);
        }else{
            root.right=Build(root.right, val);
        }
        return root;
    }
    public static void Print(Node root){
        if(root==null){
            return;
        }
        Print(root.left);
        System.out.println(root.data+" ");
        Print(root.right);
    }
    public static void  range(Node root,int x, int y){
        if(root==null){
            return;
        }
        if(root.data>=x && root.data<=y){
            range(root.left,x,y);
            System.out.println(root.data+" ");
            range(root.right,x,y);
        }
       else if(root.data>=y){
            range(root.left,x,y);            
        }else{
            range(root.right,x,y);
        }        
    }
}
class PrintRange {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Bt.Node root=null;
        int values[]=new int[n];
        for(int i=0;i<n;i++){
            values[i]=sc.nextInt();
        }
        for(int i=0;i<values.length;i++){
            root=Bt.Build(root,values[i]);
        }
        Bt.Print(root);
        Bt.range(root,sc.nextInt(),sc.nextInt());
       // Bt.Print(root);
    }
}
