
import java.util.*;

public class Binarysearch {
    /*public static int binary(int[] arr,int left,int right,int t){
        int m=(left+right)/2;
        if(arr[m]==t){
            return m;
        }
        else if(arr[m]>t){
            right=m-1;
        }
        else if(arr[m]<t){
            left=m+1;
        }
        return binary(arr, left, right, t);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.err.println(binary(arr, 0, n-1, t));
    }*/
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int t=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       Arrays.sort(arr);
       int left=0,right=n-1;
       while(left<=right){
        int m=(left+right)/2;
        if(arr[m]==t){
            System.out.print(m);
            return;
        }
        else if(arr[m]>t){
            right=m-1;
        }
        else if(arr[m]<t){
            left=m+1;
        }
       }
   }
}
