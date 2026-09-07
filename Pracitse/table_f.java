
import java.util.Scanner;

public class table_f {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no:");
     int n=sc.nextInt();
     table(n);
 }   
 public static void table(int n){
    for(int i=1; i<=10; i++){
        System.out.println(n+"X"+i+"="+n*i);
    }
 }
}
