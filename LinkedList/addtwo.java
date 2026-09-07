//import java.lang.classfile.components.ClassPrinter;
import java.util.*;
class ll{
    Node head;
    class Node{
        int v;
        int n;
        Node next;
        public Node(int v,int n, Node next) {
            this.v = v;
            this.n = n;
            this.next = next;
          
        }       
    }
    public void add1(int v){
        Node nw=new Node(v,0,null);
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
    public void  add2(int n){
        Node nw=new Node(0,n,null);
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
    public void print1(){
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
    public void print2(){
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
   /*  public Node result(Node head1,Node head2){
       if(head1==null && head2==null){
        return null;
       }
       if(head1==null){
        return head2;
       }
       if(head2==null){
        return head1;
       }
      Node cur1=head1;
      Node cur2=head2;
      int s=0,g=0;
      while(cur1!=null){
        s=s*10+cur1.v;
        cur1=cur1.next;
      }
      while(cur2!=null){
        g=g*10+cur2.n;
        cur2=cur2.next;
      }
      int k=s+g;
     Node res=new Node(0, 0, null);
     Node cur=res;
     while(k>0){
        int m=k%10;
        cur.next=new Node(m, 0, null);
        k=k/10;
        cur=cur.next;
     }

        return res.next;
    } */
   public Node result(Node head1,Node head2){
    Node nw=new Node(0,0,null);
    Node cur=nw;
    int carry=0;
    int sum=0;
    while(head1!=null || head2!=null || carry!=0){
        sum=carry;
        if(head1!=null){
            sum+=head1.v;
            head1=head1.next;
        }
        if(head2!=null){
            sum+=head2.n;
            head2=head2.next;
        }
        carry=sum/10;
        cur.next=new Node(sum%10,0,null);
        cur=cur.next;
    }
    return nw.next;
   }
    public void print(){
        if(head==null){
            System.out.println("0");
            return;
        }
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.v+" ");
            cur=cur.next;
        }
    }
    
}
class addtwo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll n=new ll();
        ll v=new ll();
        int m=sc.nextInt();
       
        System.out.println("Enter the first values");
        for(int i=0;i<m;i++){
            v.add1(sc.nextInt());
        }
        System.out.println("Enter the Second values");
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            n.add2(sc.nextInt());
        }
        v.print1();
        n.print2();
        ll r=new ll();
        r.head=r.result(v.head,n.head);
        r.print();
        
    }
}
