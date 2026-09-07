
import java.util.Scanner;

public class primeno_f {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=sc.nextInt();
        int c=prime_no(n);   
        if(c==2){
            System.out.println("Prime Number");
        } 
        else{
            System.out.println("Not a Prime number");
        }
    }    
    public static int prime_no(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c=c+1;
                
            }
        }
        return c;
    }
}
