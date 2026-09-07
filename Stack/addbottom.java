import java.util.*;
class Stak{
    public static void atbottom(Stack<Integer>s,int a){
        if(isEmpty(s)){
            s.push(a);
            return;
        }
        int top=s.pop();
        atbottom(s, a);
        s.push(top);
    }
     public static boolean isEmpty(Stack<Integer> s){
        return s.isEmpty();
    }
    public static void reverse(Stack<Integer> s){
        if(isEmpty(s)){
            return;
        }
        int top= s.pop();
        reverse(s);
        atbottom(s,top);
    }
}
class addbottom{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Stak d=new Stak();
        int n=sc.nextInt();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
       // int a=sc.nextInt();
        System.out.println(s);
      //  Stak.atbottom(s,a);
      Stak.reverse(s);
        System.out.println(s);
    }
   
}