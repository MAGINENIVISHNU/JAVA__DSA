package DSA.Leet_code;
import java.util.*;
class Q121{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int ma=0;
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            else{
                ma=Math.max(ma,(arr[i]-min));
            }
        }
        System.out.println(ma);
    
        
    }
}