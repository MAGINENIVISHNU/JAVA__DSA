
import java.util.Scanner;

class ll{
    Node head;
    public int size;
    ll(){
        size=0;
    }
    class Node{
        int a;
        Node next;
        Node(int a){
            this.a=a;
            this.next=null;
            size++;
        }      
    }
    public void add(int a){
        Node nw=new Node(a);
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
    public void print(){
        if(head==null){
            System.err.println("Null");
            return;
        }
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.a+"->");
            cur=cur.next;
        }
        System.out.println("Null");
    }
    public Boolean palind(){
       if(head==null ||head.next==null){
        return true;
       }
       Node mid=findmid(head);
       Node secstart=rever(mid.next);
       Node cur=head;
       while(secstart!=null){
        if(cur.a!=secstart.a){
            return false;
        }
        secstart=secstart.next;
        cur=cur.next;
       }
       return true;
    }
    public Node findmid(Node head){
        Node s=head;
        Node f=head;
        while(f.next!=null  && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public Node rever(Node head){
        Node pre=null;
        Node cur=head;
        while(cur!=null){
            Node next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
class paliadrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ll a=new ll();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        a.print();
        System.out.println(a.palind());
    }
}
