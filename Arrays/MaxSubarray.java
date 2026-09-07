package JAVA.DSA.Arrays;
import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the size array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int p=0;
        int sum=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            p+=arr[i];
            sum=Math.max(p, sum);
            if(p<0){
                p=0;
            }
        }
        System.err.println(sum);
    }
    /*
     public static int kadane(int[] arr,int sum,int cur,int i){
    if(i==arr.length){
      return sum;
    }
    cur+=arr[i];
    if(cur>sum){
      sum=cur;
    }
    return kadane(arr,sum,cur,i+1);
  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.print(kadane(arr,0,0,0));
  } */
}