package DSA.Bit_munipation;

import java.util.Scanner;

public class count_one {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
   //    int cnt=0;
   //    while(n>0){
   //      if((n&1)==0){
   //          cnt++;
   //      }
   //      n>>=1;
   //    }
   //  System.out.println(cnt);
   //  int p=0;
   //  int place=1;
   //  while(n>0){
   //      p=p+(n&1)*place;
   //      n>>=1;
   //      place*=10;

   //  }
   //  System.err.println(p);
   // System.out.println(n&1);  find the LSB
   int p=0;
   while(n>0){
    p=(n&1);
    n>>=1;

   }
   System.err.println(p);
   }
}
