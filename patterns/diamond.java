
import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the no:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.err.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.err.print("*");
            }System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1; j<=n-i;j++){
                System.err.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.err.print("*");
            }System.out.println();
        }
    }
}
