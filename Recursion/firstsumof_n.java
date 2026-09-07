package DSA.Recursion;

import java.util.Scanner;

public class firstsumof_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(1,n,0);
    }
    public static void print(int i,int n,int sum) {
        if(i==n){
            System.out.println(sum);
            return;
        }
        sum+=i;
        print(i+1, n, sum);

        
    }
}
