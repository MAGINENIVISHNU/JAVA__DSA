package dsa.sorting;
import java.util.Scanner;
public class Mergesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        divider(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void divider(int[] arr,int st,int ed){
        if(st>=ed){
            return;
        }
        int mid=st+(ed-st)/2;
        divider(arr, st, mid);
        divider(arr, mid+1, ed);
        conquer(arr,st,mid,ed);
    }
    public static void conquer(int[] arr,int st,int mid,int ed){
        int mer[]=new int[ed-st+1];
        int id1=st;
        int id2=mid+1;
        int k=0;
        while(id1<=mid && id2<=ed){
            if(arr[id1]<=arr[id2]){
                mer[k++]=arr[id1++];
            }else{
                mer[k++]=arr[id2++];
            }
        }
        while(id1<=mid){
                mer[k++]=arr[id1++];
            
        }
        while(id2<=ed){
            
                mer[k++]=arr[id2++];
        }
        for(int i=0,j=st;i<mer.length;i++,j++){
            arr[j]=mer[i];
        }
    }
}
