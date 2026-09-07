package DSA.LinkedList;

import java.util.Scanner;

class Pr{
    Node head;
    private int size;
    Pr(){
        size=0;
    }
    public class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next=null;
            size++;
        }      
    }
    public void add(String data){
       Node newnode=new Node(data);
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
    public int Search(String data){
        Node cur=head;
        int i=0;
        while(cur!=null){
            if(cur.data.equals(data)){
                return i;
            }
            i++;
            cur=cur.next;
        }
        
        return -1;
    }
}
public class search {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pr n=new Pr();
        int no=sc.nextInt();
        for(int i=0;i<no;i++){
            n.add(sc.next());
        }
        String data=sc.next();
        int result=n.Search(data);
        if(result!=-1){
            System.out.println("Found at: "+result);
            return;
        }
        System.out.println("Not Found");

    }
}
