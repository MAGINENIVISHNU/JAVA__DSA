package Arrays;

import java.util.*;
class Containermostwater{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt(); 
    }    
    System.out.println(Maximumwater(arr));
  }
  public static int Maximumwater(int[] arr){
    int left=0;
    int right=arr.length-1;
    int max=0;
    while(left<right){
      int w=right-left;
      int h=Math.min(arr[left],arr[right]);
      int cur=w*h;
      max=Math.max(max, cur);
      if(arr[left]>arr[right]){
        right--;
      }else{
        left++;
      }
    }
    return max;
  }
}