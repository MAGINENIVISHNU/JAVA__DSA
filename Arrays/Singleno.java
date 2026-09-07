package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Singleno {
    public static int[] single(int n,int[] arr,int[] arr2){
  int k=0;
  for(int i=0;i<n-1;i++){
    int c=0;
    for(int j=0;j<n;j++){
      if(arr[i]==arr[j]){
        c++;
      }
    }
    if(c==1){
      arr2[k]=arr[i];
      k++;
    }
  }
  return arr2;
 }
 public static void main(String [] args){

  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  int arr2[]=new int[n];
  
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  Arrays.sort(arr);
  int[] ans=single(n, arr, arr2);
  for(int i=0;i<n;i++){
    System.err.print(ans[i]+" ");
  }
 }
}
