
import java.util.Scanner;

public class Palindrome {
    /*public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String a=sc.next();
  int left=0;
  int right=a.length()-1;
  while(left<(a.length()/2)){
    if(a.charAt(left)!=a.charAt(right)){
      System.out.println("not a palindrome");
      return;
    }
    left++;
    right--;
  }
  System.out.println("palindrome");
 }*/
public static boolean  pal(String s){
  int left=0;
  int right=s.length()-1;
  while(left<(s.length()/2)){
    if(s.charAt(left)!=s.charAt(right)){
      return false;
    }
    left++;
    right--;
  }
  return true;
}
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  if(pal(s)==true){
    System.err.println("Palidrome");
  }else{
    System.out.println("Not Palidrome");
  }
}
}
