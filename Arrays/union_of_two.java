Package DSA.Arrays;
import java.util.*;
class union_of_two{
    public static int[] uni(int n,int[] arr,int[] arr2,int[] re){
    int k=0;
    for(int i=0;i<n;i++){
      re[k]=arr[i];
      k++;
    }
    for(int i=0;i<n; i++){
      int c=0;
      for(int j=0;j<k;j++){
        if(arr2[i]!=re[j]){
        c++;
      }
    }
    if(c==k){
        re[k]=arr2[i];
        k++;
      }
    }
    return re;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int arr2[]=new int[n];
    int re[]=new int [n+n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      arr2[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    Arrays.sort(arr2);
    int[] ans=uni(n,arr,arr2,re);
    for(int i=0;i<re.length;i++){
      System.out.print(ans[i]+" ");
    }
  }
}