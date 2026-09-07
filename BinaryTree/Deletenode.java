package DSA.BinaryTree;
import java.util.*;
class Bt{
    static class Node{
        Node left;
        Node right;
        int  data;
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
        }else{
            root.right=build(root.right, val);
        }
        return root;
    }
    public static Node del(Node root,int val){
        if(root==null){
            return null;
        }
        if(root.data>val){
            root.left=del(root.left, val);
        }else if(root.data<val){
            root.right=del(root.right, val);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }if(root.left==null){
                return root.right;
            }if (root.right==null){
                return root.left;
            }
              Node Is=Inordersucces(root.right);
              root.data=Is.data; 
              root.right=del(root.right, Is.data);
        }
      
        return root;
    }
    public static Node Inordersucces(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void print(Node root){
        if(root==null){
            return;
        }
        print(root.left);
        System.out.println(root.data+" ");
        print(root.right);
    }
}
class Deletenode{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int values[]=new int[n];
        Bt.Node root=null;
        for(int i=0;i<n;i++){
            values[i]=sc.nextInt();
        }
        for(int i=0;i<values.length;i++){
            root=Bt.build(root, values[i]);
        }
        Bt.print(root);
       root= Bt.del(root, sc.nextInt());
        Bt.print(root);
    }
}
