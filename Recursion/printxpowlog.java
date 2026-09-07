package DSA.Recursion;

import java.util.Scanner;

public class printxpowlog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        cal(x,n);
        System.out.println(cal(x,n));
    }
    public static int cal(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return cal(x,n/2)*cal(x,n/2);
        }
        else{
            return cal(x, n/2)*cal(x, n/2)*x;
        }
    }
}
