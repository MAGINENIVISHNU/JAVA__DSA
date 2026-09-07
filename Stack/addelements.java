import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    static Node head;
    public static boolean isEmpty(){
        return head==null;
    }
    //push
    public static void add(int data){
        Node nw=new Node(data);
        if(isEmpty()){
            head=nw;
            return;
        }
        nw.next=head;
        head=nw;
    }
    //pop
    public static int pop(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    //peek
    public static void  peek(){
        if(isEmpty()){
            System.out.println("Null");
            return;
        }
        System.out.println(head.data);
        pop();
        peek();
    }
    public static void atbottom(int s){
        Node nw=new Node(s);
        if(isEmpty()){
            head=nw;
            return;
        }
        int top=pop();
        atbottom(s);
        add(top);
    }
}
class addelements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack a=new Stack();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
     a.peek();
        a.pop();
        int s=sc.nextInt();
        a.atbottom(s);
        a.peek();
    }
}
