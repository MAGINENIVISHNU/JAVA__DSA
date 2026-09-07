package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Dulipate {
 public static int[] duplicate(int[] arr,int[] arr2){
    Arrays.sort(arr);
    int k=0;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]!=arr[i+1]){
        arr2[k]=arr[i];
        k++;
      }
    }
    arr2[k]=arr[arr.length-1];
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
    int[] ans=duplicate(arr,arr2);
    for(int i=0;i<n;i++){
      System.out.print(ans[i]+" ");
    }
  }
   public static int[] single(int n,int[] arr,int[] arr2){
  int k=0;
  for(int i=0;i<n-1;i++){
    int c=0;
    for(int j=i+1;j<n;j++){
      if((arr[i]^arr[j])==0){
        c++;
      }
    }
    if(c==0){
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
  int[] ans=single(n, arr, arr2);
  for(int i=0;i<n;i++){
    System.err.print(ans[i]+" ");
  }
 }
}

