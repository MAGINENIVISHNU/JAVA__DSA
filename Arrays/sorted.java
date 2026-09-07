package JAVA.DSA.Arrays;

import java.util.Scanner;

public class sorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
          }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
