package DSA.Bit_munipation;
import java.util.Scanner;

public class count_Array1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        int cnt=0;
        int result[]=new int[n+1];
        for(int i=0;i<=n;i++){
            cnt=0;
            int temp=i;
            while(temp>0){
            if((temp&1)==1){
                cnt++;
            }
           temp>>=1;
           }
         result[i]=cnt;
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
