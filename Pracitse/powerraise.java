
import java.util.Scanner;

public class powerraise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two no:");
        int x=sc.nextInt();
        int n=sc.nextInt();
        power(x,n);
        System.err.println("power raised  "+power(x,n));
    }
    public static int power(int x,int n){
        return (int)Math.pow(x,n);
    }
}
