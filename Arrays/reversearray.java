package DSA.Arrays;

import java.util.Scanner;

public class reversearray {
    public static int[] reverse(int n,int[] arr1,int[] arr2){
    for(int j=0;j<n;j++){
      arr2[j]=arr1[n-1-j];
  }
  return arr2;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[n];
    for(int i=0;i<n;i++){
      arr1[i]=sc.nextInt();
    }
    int[] ans=reverse(n, arr1, arr2);
    for(int i=0;i<n;i++){
      System.out.print(ans[i]+" ");
    }
  }
  
    
}
