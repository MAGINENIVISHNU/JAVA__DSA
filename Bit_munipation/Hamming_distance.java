/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

 

Example 1:

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
Example 2:

Input: x = 3, y = 1
Output: 1
*/
import java.util.*;
class Hamming_distance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        while((a!=0) || (b!=0)){
           if((a&1)!=(b&1)){
             c++;
           }
           b>>=1;
            a>>=1;
            
        }
       System.out.println(c);


    //    int x=sc.nextInt();
    //    int y=sc.nextInt();
    //    int z=x^y;
    //    int cnt=0;
    //    String m=Integer.toBinaryString(z);
    //    for(int i=0;i<m.length();i++){       
    //     if(m.charAt(i)==1){
    //         cnt++;
    //          }
    //     }
    // System.out.println(cnt);
    }
}
 