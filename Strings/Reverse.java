
import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner sc=new  Scanner(System.in);
        String s=sc.next();
        
        int right=s.length()-1;
        String n="";
        while(right>=0){
           n+=s.charAt(right);
            
            right--;
        }
        System.out.println("Reversed String  "+n);
    }
}
