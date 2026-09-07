package DSA.BinaryTree;
import java.util.*;
class BT{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static int idx=-1;
        public static Node build(int [] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node nw=new Node(nodes[idx]);
            nw.left=build(nodes);
            nw.right =build(nodes);
            return nw;      
        }
        public static  void Prorder(Node t){
            if(t==null){
                return;
            }
            System.out.print(t.data+" ");
            Prorder(t.left);
            Prorder(t.right);

        }
    }
public class Preorder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nodes[]=new int[n];
        for(int i=0;i<n;i++){
            nodes[i]=sc.nextInt();
        }
        //BT a=new BT();
        BT.Node t=BT.build(nodes);
        BT.Prorder(t);
       
        //System.out.println(t+" ");
    }
}
