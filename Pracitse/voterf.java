import java.util.Scanner;

public class voterf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int n=sc.nextInt();
        elibigity(n);
    }
    public static void elibigity(int n){
        if(n>=18){
            System.out.println("Your are eligible to vote");
        }
        else{
            System.err.println("Not eligible");
        }
    }
}
