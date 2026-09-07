
import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
        int m=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //        m++;
        //     }
        // }
        // if(m==2){
        //     System.err.println("Prime number");

        // }
        // else{
        //     System.err.println("Not prime");
        // }
        boolean flag=true;
        for(int i=2;i<n/2;i++){
            if (n%i==0){
                flag=false;
            }
        }
        System.err.println(flag);
    }
}
