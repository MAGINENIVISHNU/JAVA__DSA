
import java.util.Scanner;

public class removeInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
       String n= a.replaceAll(" ", "");
        System.err.println(n);
    }
}
