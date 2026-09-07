package DSA.Leet_code;
import java.util.*;
class Twosum{
    public static void main(String args[]){
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the Array length");
        int n=sc.nextInt();
        System.out.println("Enter the target");
        int t=sc.nextInt();
        int []m=new int[n];
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        cal(m,t);
        // for(int i=0;i<2;i++){

        // }
    }
    public static void cal(int m[],int t) {
        int s=m.length;
        for(int i=0;i<s-1;i++){
            for(int j=i+1;j<s;j++){
                if(m[i]+m[j]==t){
                    //return new int[]{i,j};
                    System.out.println(i+" "+j);
                }
            }
            
        }
        // return new int[]{};
System.err.println("");

        
    }

}