package DSA.Recursion;

import java.util.Scanner;

class sum_prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        sum = prime(n,sum);
        System.out.println(sum);
        }
        public static int prime(int n,int sum){
            if(n==0 || n==1){
                return sum;
            }
            int c=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    c++;
                }
            }
            if(c==2){
                sum+=n;
            }
            return prime(n-1, sum);
        }
}