
import java.util.Scanner;

public class Even_f {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no:");
     int i=sc.nextInt();
     even(i);
 
    }
    public static int even(int i){
        if(i%2==0){
            System.out.println("Even ");
            return 0;
        }
        else{
            System.out.println("Odd");
            return 0;
        }
    }   
}
