package DSA.sorting;

import java.util.Scanner;

class insertion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Insertion sort
        for(int i=1;i<n;i++){
            int j=i-1;
            int cur=arr[i];
            while(j>=0 && arr[j]>cur){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=cur;
        }
        // calling function
        printarr(arr);
    }
    public static void printarr(int []arr) {

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}