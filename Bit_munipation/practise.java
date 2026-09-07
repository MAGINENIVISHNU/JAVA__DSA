import java.util.*;

class practise{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       int l=0,r=0;
       int max=0;
       if(s.length()==1){
        System.err.println("1");
        return;
       }
       for( r=0;r<s.length()-1;r++){
        for(int i=l;i<r;i++){
            if(s.charAt(i)==s.charAt(r)){
                l=i+1;
                break;

            }
        }
        max=Math.max(max,r-l+1);
       }
       System.out.print(max);
   }
}