
import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        greater(a,b);
        System.out.println(greater(a,b));
    }
    public static int greater(int a,int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
