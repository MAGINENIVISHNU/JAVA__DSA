
import java.util.Scanner;

public class count_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            int c=1;
            char ch=a.charAt(i);
            boolean s=false;
            for(int k=0;k<i;k++){
                if(ch==a.charAt(k)){
                    s=true;
                    break;

                }
            }
            if(s)
                continue;
            for(int j=i+1;j<a.length();j++){   
                if(ch==a.charAt(j)){
                    c++;                    
                }                
            }
            System.out.println(ch+" "+c);
            
        }
      
    }
}
