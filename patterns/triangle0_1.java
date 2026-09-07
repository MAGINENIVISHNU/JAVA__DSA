
import java.util.Scanner;

public class triangle0_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the no:");
        int n=sc.nextInt();
        int m=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                m=i+j;
                if(m%2==0){
                    System.err.print("1");
                }
                else{
                    System.err.print("0");
                }
                
            }System.err.println("");
        }
    }
}
