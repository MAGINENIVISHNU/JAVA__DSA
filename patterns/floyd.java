
import java.util.Scanner;

public class floyd {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the no of rows");
     int n=sc.nextInt();
     int m=1;
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            
                System.err.print(" "+m+" ");
                m++;
            
        }System.err.println("");
     }
 }   
}
