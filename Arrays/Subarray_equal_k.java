package Arrays;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Subarray_equal_k
 */
public class Subarray_equal_k {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the K");
    int k=sc.nextInt();
    System.out.println(prefix(arr,k));
  }
  public static int prefix(int [] arr,int k){
    int n=arr.length;
    int cnt=0;
    int pre=0;
    HashMap<Integer,Integer>set=new HashMap<>();
    set.put(0, 1);
    for(int i=0;i<n;i++){
      pre+=arr[i];
      if(set.containsKey(pre-k)){
        cnt+=set.get(pre-k);
      }
      set.put(pre,set.getOrDefault(pre,0)+1);
    }
    return cnt;
   
  }
}