import java.util.Scanner;

public class ReverseString {
    public static  String Rever(int idx,String s,String s2){
    if(idx==0){
      s2+=s.charAt(idx);
      return s2;
    }
    s2+=s.charAt(idx);
    return Rever(idx-1,s,s2+" ");
  }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      System.out.println(Rever(s.length()-1,s,""));
  }
}
