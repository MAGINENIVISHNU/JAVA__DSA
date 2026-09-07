import java.util.*;
class ll{
    Node head;
    private int size;
    ll(){
        size=0;
    }
    class Node{
        int n;
        Node next;

        public Node(int n){
            this.n=n;
            this.next=null;
            size++;
        }
        
    }
    public void add(int n){
        Node newnode=new Node(n);
        if(head==null){
            head=newnode;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=newnode;
    }
    public void print(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.n+"->");
            cur=cur.next;
        }
        System.out.println("Null");
    }
    public int getsize(){
        return size;
    }
    public void filter(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        if(head.next==null && head.n>25){
            System.out.println("Empty");
            return;
        }
        Node prev=head;
        Node cur=head.next;
        while(cur!=null){
            if(cur.n > 24){
                prev.next=cur.next;
                size--;
            }else{
                prev=cur;
            }
            cur = cur.next;
        }
    }
}
public class remove25elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll n=new ll();
        for(int i=1;i<=50;i++){
            n.add(i);
        }
        System.out.println(n.getsize());
        n.print();
        n.filter();
        n.print();
    }   
}
