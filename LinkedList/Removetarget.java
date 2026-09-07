import java.util.*;
class ll{
    Node head;
    class Node{
        int v;
        Node next;
        Node(int v){
            this.v=v;
            this.next=null;
        }
    }
    public void add(int v){
        Node nw=new Node(v);
        if(head==null){
            head=nw;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=nw;
    }
    public Node remove(Node head,int t){
        while(head!=null && head.v==t){
            head=head.next;
        } 
        if(head==null){
            return null;
        }
              
        Node prev=head;
        Node cur=head.next;
        while(cur!=null){
            if(cur.v==t){
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        return head;
    }
    public void print(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.v+"->");
            cur=cur.next;
        }
        System.out.println("Null");
    }
}
public class Removetarget {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ll v=new ll();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            v.add(sc.nextInt());
        }
        System.out.println("Enter the target");
        int t=sc.nextInt();
        v.print();
        v.head=v.remove(v.head,t);
        v.print();


    }
}