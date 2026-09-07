package DSA.BinaryTree;
import java.util.*;
class Bt{
    static class Gu{
        int data;
        Gu left;
        Gu right;
        Gu(int data){
            this.data=data;
        }
    }
    static int idx=-1;
    public static Gu build(int [] node){
        idx++;
        if(node[idx]==-1){
            return null;
        }
        Gu nw=new Gu(node[idx]);
        nw.left=build(node);
        nw.right=build(node);
        return nw;
    }
    public static int height(Gu root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int heg=Math.max(left, right)+1;
        return heg;
    }
}
class Height_tree{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int node[]=new int[n];
        for(int i=0;i<n;i++){
            node[i]=sc.nextInt();
        }
        Bt.Gu root=Bt.build(node);
        System.out.println(Bt.height(root));
    }
}