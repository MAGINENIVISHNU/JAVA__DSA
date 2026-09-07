package DSA.Bit_munipation;

import java.util.Scanner;

public class Even_odd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5;
     
       // int Bit=1 << 0;
        // if((Bit & n)==0){
        //    System.err.println("Even");
        // }
        // else{
        //    System.err.println("Odd");
        // }
   

/* Check the ith position is set or clear */
    //    int postion =sc.nextInt();
    //    int Bit=1 << postion;
    //    if((Bit & postion)==0){
    //     System.out.println("Clear");
    //    }
    //    else{
    //     System.out.println("Set");
    //    }
    //    // Set the ith index
        int postion =sc.nextInt();
       int Bit=1 << postion;
       if((Bit | postion)==0){
        System.out.println("Clear");
       }
       else{
        System.out.println("Set");
       }
    }
}