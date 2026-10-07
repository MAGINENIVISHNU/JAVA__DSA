package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Product_array_expect_it_self{
      public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    } 

  System.out.println(Arrays.toString(maxsum(arr)));
  }
  public static int[] maxsum(int [] arr){
    int arr2[]=new int[arr.length];
    int left=1;
    for(int i=0;i<arr.length;i++){
      arr2[i]=left;
      left=left*arr[i];
    }
    int right=1;
    for(int i=arr.length-1;i>=0;i--){
      arr2[i]=right*arr2[i];
      right=right*arr[i];
    }
   return arr2;
  }
}