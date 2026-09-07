//good no=9860
//sum = 0 and sum<6
//sum=0+6 ,sum<8
//sum=0+6+8,sum>9// conditon fails so not a good no
import java.util.*;
public class goodno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        while(n>0){
            int m=n%10;
            n=n/10;
            if(sum<=m){
                sum+=m;
            }
            else{
                System.out.println("Not a Good Number");
                System.exit(0);
            }
        }
        System.out.println("Good number");
        
    }
}
