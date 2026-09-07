
import java.util.Scanner;

class even_odd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if((n&1)==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
