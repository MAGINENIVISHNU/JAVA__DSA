import java.util.Scanner;

public class occurances {
    public static int first=-1;
    public static int second=-2;
  public static String ocuran(int idx,String s,char elem){
    if(idx==s.length()){
      return first + "," + second;
    }
    char cur=s.charAt(idx);
    if(cur==elem){
      if(first==-1){
        first=idx;
      }
      else{
        second=idx;
      }
    }
    return ocuran(idx+1, s, elem);
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char elem=sc.next().charAt(0);
    System.out.print(ocuran(0, s, elem));
  }
}
