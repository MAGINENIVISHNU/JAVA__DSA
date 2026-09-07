package DSA.BinaryTree;
import java.util.*;
class Bt{
    static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
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
        return  nw;      

    }
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node cur=q.remove();
            if(cur==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(cur.data+" ");
                if(cur.left!=null){
                    q.add(cur.left);
                }if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
    }
}
public class LevelOrder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int node[]=new int[n];
        for(int i=0;i<n;i++){
            node[i]=sc.nextInt();
        }
        Bt.Node root = Bt.build(node);
        Bt.levelorder(root);
    }
}
