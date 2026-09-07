/*write a java program to reverse the given characters by using stack

example:
input:
4
a b c d
output:
d c b a
*/
//package DSA.Stack;

import java.util.*;
class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Character>s=new Stack<>();
       // Stack<Integer>a=new Stack<>();
        for(int i=0;i<n;i++){
            s.push(sc.next().charAt(0));
        }
        for(int i=0;i<n;i++){
             System.out.print(s.pop()+" ");
        }
      
    }
}