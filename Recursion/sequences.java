import java.util.Scanner;

public class sequences {
     public static  void  sequence(String s,String s2,int idx){
    if(idx==s.length()){
      System.out.println(s2);
      return;
    }
    char cur=s.charAt(idx);
     sequence(s, s2+cur, idx+1);
     sequence(s, s2, idx+1);
  }
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sequence(s, "", 0);
  }
}
