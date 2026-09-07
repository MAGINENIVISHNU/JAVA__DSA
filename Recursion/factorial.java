package DSA.Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n,1);
    }
    public static void print(int n,int fact) {
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact=fact*n;
        print(n-1,fact);
        
    }
}
