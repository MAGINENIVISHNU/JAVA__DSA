
import java.util.Scanner;

public class parallogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=sc.nextInt();
        //int m=sc.nextInt();
        for(int i=1;i<=n;i++){  //4
            for(int j=1;j<=n-i;j++){
                System.err.print("  ");
            }
           for(int j=1;j<=4;j++){
            System.err.print("*");
           }System.err.println("");
        }
    }
}
