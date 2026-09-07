import java.util.Scanner;

public class Tower {
    public static void tower(int n,String s,String h,String d){
  if(n==1){
    System.out.println("Transfer  "+n+" From "+s+" to "+d);
    return;
  }
  tower(n-1,s,d,h);
  System.out.println("transfer "+n+" from "+s+" to "+d);
  tower(n-1,h,s,d);
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  tower(n,"Source","Helper","Density");
 }
}
