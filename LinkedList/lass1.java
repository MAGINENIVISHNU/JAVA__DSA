package DSA.LinkedList;
class LL{
    Node head;
    private int size;

     LL() {
        size=0;
    }
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addfirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
        size++;
    }
    public void printlist(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"-->");
            cur=cur.next;
        }
        System.err.println("null");
    }
    public void removefirst(){
        if(head==null){
            System.err.println("Empty ");
            return;
        }
        head=head.next;
        size--;
    }
    public void removelast(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node cur=head;
        size--;
        Node last=head.next;
        while(last.next!=null){
            cur=cur.next;
            last=last.next;
        }
        cur.next=null;
    }
    public int getsize(){
        //System.out.println(size);
        return size;
    }
    // REVERSE ITERATION
    public void reverseiteration(){
        Node prev=head;
        Node cur=head.next;
        while(cur!=null){
            Node nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }
        head.next=null;
        head=prev;
    }
    //REVERSE RECURSION
    public Node reverserecursion(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newhead=reverserecursion(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    //SWAP 
    public 
}
public class lass1{
    public static void main(String[] args){
        LL v=new LL();
        v.addfirst("This");
        v.addlast("is");
        v.addlast("vishnu");
        v.addlast("Says");
        v.addlast("Heal");
        // v.printlist();
        // v.removefirst();
        // v.removelast();
        v.printlist();
        //v.reverseiteration();
      v.head=  v.reverserecursion(v.head);
        v.printlist();
        System.out.println(v.getsize());
    }
}
