
import java.util.Scanner;

public class triangleno2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the no");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.err.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.err.print(j);
            }
            System.err.println("");
        }
    }
}
