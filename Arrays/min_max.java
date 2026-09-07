package JAVA.DSA.Arrays;

import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[n-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum is"+max);
        System.out.println("Minimum is"+min);
    }
}
