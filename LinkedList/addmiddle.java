import java.util.*;

class ll{
    Node head;
    private  int size;

    public ll() {
        size=0;
    }
    
    public int getsize() {
        return size;
    }
    
    public class Node{
        int v;
        Node next;
        Node(int v){
            this.v=v;
            this.next=null;
            size++;
        }
    }
    public void add(int v){
        Node newNode=new Node(v);
        if(head==null){
            head=newNode;
            head.next=null;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
    }
    public void middleadd(int g,int idx){
        if(idx< 0 || idx >size){
            System.out.println("Invalid Index");
            return;
        }
        Node newnode=new Node(g);
        if(head==null || idx==0){
            newnode.next=head;
            head=newnode;
            return;
        }
        Node cur=head;
        for(int i=1;i<idx;i++){
            cur=cur.next;
        }
        newnode.next=cur.next;
        cur.next=newnode;
    }
    public void print(){
        Node cur=head;
        if(head==null){
            System.err.println("Empty");
            return;
        }
        while(cur!=null){
            System.out.print(cur.v+" -> ");
            cur=cur.next;
        }
        System.err.println("null");
    }
}
class addmiddle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll m=new ll();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            m.add(sc.nextInt());
        }
        System.out.println("Size:"+m.getsize());
        System.out.println("Enter the index and value");
        int idx=sc.nextInt();
        int g=sc.nextInt();
        m.print();
        m.middleadd(g, idx);
        m.print();
    }
}