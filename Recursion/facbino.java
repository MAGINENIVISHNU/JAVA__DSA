
/*
Fibonacci Number

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

 

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
*/
//package DSA.Recursion;

import java.util.*;
public class facbino {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
        System.out.println(print(n));
    }
    public static int print(int n){
        if(n==1 || n==0){
           return n;
        }
        return n=print(n-1)+print(n-2);
    }
    /* public static int fib(int n,int sum,int a,int b){
    if(n==0){
      return 1;
    }
    else if(n==1){
      return sum;
    }
    sum=a+b;
    return fib(n-1,sum,b,sum);
  }
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(fib(n,0,0,1));
  } */
}


