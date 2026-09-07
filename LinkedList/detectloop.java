import java.util.*;

class ll{
    Node head;
    private int size;

    public ll() {
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
    public Boolean isEmpty(){
        return head==null;
    }
    public void add(int a){
        Node nw=new Node(a);
        if(isEmpty()){
            head=nw;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=nw;
    }
    public Boolean loop(){
        if(isEmpty()){
            return false;
        }
        Node s=head;
        Node f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                return true;
            }
        }
        return false;
    }
    public void print(){
        if(isEmpty()){
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
    
}
class detectloop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll a=new ll();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        a.print();
        System.out.println(a.loop());
    }
}