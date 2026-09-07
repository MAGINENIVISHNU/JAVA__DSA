import java.util.Scanner;

public class phonenocomb {
     public static String[] map={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void combi(String s,int idx,String comb){
      if(idx==s.length()){
        System.out.println(comb);
        return;
      }
      char cur=s.charAt(idx);
      String key=map[cur-'0'];
      for(int i=0;i<key.length();i++){
        combi(s,idx+1,comb+key.charAt(i));
      }
    }
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      combi(s,0,"");

    }
}
