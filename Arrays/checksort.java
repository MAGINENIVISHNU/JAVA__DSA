package JAVA.DSA.Arrays;
import java.util.*;
public class checksort {
  public static int check(int c, int[] arr){
    for(int i=0;i<arr.length-1; i++){
      if(arr[i]>arr[i+1]){
        c++;
      }
    }
    return c;
  }
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int c=0;
    c = check(c, arr);
    if(c>0){
      System.out.println("Array is not Sorted");
    }
    else{
      System.out.println("Array is Sorted");
    }
  }
}