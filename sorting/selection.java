package DSA.sorting;

import java.util.Scanner;

public class selection {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //selection sort
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[small]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        printarr(arr);
    }
    public static void printarr(int []arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
