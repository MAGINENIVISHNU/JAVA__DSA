
import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.compareTo(s2) == 0){
            // Strings are equal
            System.out.println("Equal");
        }
        else{
            System.err.println("Not equal");
        }
    }
}
