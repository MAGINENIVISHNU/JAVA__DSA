package Arrays;
import java.util.*;
public class sortcolor {
    public static int[] Sort(int [] arr){
        divide(arr,0,arr.length - 1);
        return arr;
    }
    public static void divide(int [] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conque(arr,start,mid,end);
    }
    public static void conque(int [] arr,int start,int mid,int end){
        int merge[]=new int[(end-start)+1];
        int i1=start;
        int i2=mid+1;
        int k=0;
        while(i1<=mid && i2<=end){
            if(arr[i1]<=arr[i2]){
                merge[k++]=arr[i1++];
            }else{
                merge[k++]=arr[i2++];
            }
        }
        while(i1<=mid){
            merge[k++]=arr[i1++];
        }
        while(i2<=end){
            merge[k++]=arr[i2++];
        }
        for(int i=0,j=start;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
