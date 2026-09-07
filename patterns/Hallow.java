
import java.util.Scanner;

public class Hallow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the no:");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n+1;j++){
                if (i==0 || i==n || j==0 || j==n+1){
                    System.err.print("*");
                }
                else{
                    System.err.print(" ");
                }
            }
            System.err.println("");
        }
    }
}
