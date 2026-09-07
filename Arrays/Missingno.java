import java.util.Arrays;
import java.util.Scanner;

public class Missingno {
    public static int[] missing(int n,int[] arr,int[] arr2){
    int k=1;
    int c=0;
    for(int i=0;i<n;i++){
       while(arr[i]!=k){
        arr2[c]=k;
        k++;
        c++;
       }
       k++;
    }
    return arr2;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int arr2[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int[] ans=missing(n, arr, arr2);
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
    }

  }
}
