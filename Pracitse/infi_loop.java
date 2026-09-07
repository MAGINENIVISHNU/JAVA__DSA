
import java.util.Scanner;

public class infi_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int s=sc.nextInt();
        infinte(s);
    }
    public static void infinte(int s){
        do { 
            System.err.print(s);
            s+=1;
        } while (s>0);
    }
}
