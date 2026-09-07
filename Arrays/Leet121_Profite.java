
package JAVA.DSA.Arrays;

import java.util.Scanner;

class Leet121_Profite{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max = 0;
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }else{
                 max=Math.max(max,arr[i]-min);
            }
        }
        System.err.println("profite"+max);
        
        
    }
}