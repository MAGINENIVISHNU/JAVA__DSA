
import java.util.Scanner;

public class remove_duplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        String b = " ";
        int n=a.length();
        
        for(int i=0;i<n;i++){
            int cnt =0;
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    cnt++;
                }

            }
                if(cnt==0){
                    b+=a.charAt(i);
                    System
                }
        }
        System.err.println(b);
        
    }
}
