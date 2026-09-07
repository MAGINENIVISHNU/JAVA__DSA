import java.util.*;
class del_nth_node{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll a=new ll();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        System.err.println("Enter the target value");
        int t=sc.nextInt();
        a.print();
        a.del( t);
        a.print();
    }
}
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
            System.out.println("Empty");
            return;
        }
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.a+"->");
            cur=cur.next;
        }
        System.out.println("Null");
    }
    public void del(int t){
        if(size<t){
            System.out.println("Invalid");
            return;
        }
        if(head==null||head.next==null){
            System.out.println("Null");
            return;
        }
        if(t==size){
            head=head.next;
            return;
        }
        
       
        Node cur=head;
        int j=size-t;
        int i=1;
        while(i<j){
            cur=cur.next;   
            i++;    
        }
        cur.next=cur.next.next;
    }
}
