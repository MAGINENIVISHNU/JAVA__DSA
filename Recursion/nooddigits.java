import java.util.Scanner;

public class nooddigits {
    public static int noofdigits(int n,int cnt){
    if(n==0){
      return cnt;
    }
    return noofdigits(n/10, cnt+1);
  }
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==0){
      System.out.println("0");
    }
    else{
    System.out.println(noofdigits(n, 0));
    }
  }
}
