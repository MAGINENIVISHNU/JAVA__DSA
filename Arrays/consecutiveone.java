package DSA.Arrays;
import java.util.*;
class consecutiveone{
     public static int one(int n,int[] arr,int sum){
    int cur=0;
      for(int i=0;i<n;i++){
   
        if(arr[i]==1){
            cur+=1;
             if(sum<cur){
                sum=cur;
                
            }
        }
        else{
           cur=0;
        }
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    System.out.println(one(n,arr,sum));
  }
}