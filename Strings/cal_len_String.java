
package JAVA.DSA.String;

import java.util.Scanner;

class cal_len_String{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        int total=0;
        for(int i=0;i<=arr.length;i++){
            arr[i]=sc.nextLine();
            total+=arr[i].length();
        }
        System.out.println("Total length of String "+total);
    }
}