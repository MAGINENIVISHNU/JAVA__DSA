package JAVA.DSA.Arrays;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<arr.length;i++){
            System.err.println(arr[i]);
        }
    }
}
