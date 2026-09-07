import java.util.*;
class duplicates{
    
public static boolean keyword[]=new boolean[25];
  public static String duplicate(String s,int idx,String s2){
    if(idx==s.length()){
      return s2;
    }
    char cur=s.charAt(idx);
    if(keyword[cur-'a']){
      return duplicate(s, idx+1, s2);
    }
    else{
      s2+=cur;
      keyword[cur-'a']=true;
      return duplicate(s, idx+1, s2);
    }
  }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      System.out.println(duplicate(s, 0, ""));
    }
}
