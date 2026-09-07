package ArrayList;
import java.util.*;
class sequence{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     } 
      subsequece(arr,new ArrayList<>(),0);
   }
  public static void subsequece(int [] arr,ArrayList<Integer>v,int i){
   if(i==arr.length){
      System.out.println(v);
      return;
   }
   int temp=arr[i];
   // include current element
   v.add(temp);
   subsequece(arr, v, i+1);
   // backtrack and exclude current element
   v.remove(v.size()-1);
   subsequece(arr, v, i+1);
   
  }
}
