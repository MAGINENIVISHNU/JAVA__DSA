/*
third maximum number
consider an array or arraylist, return the third distinct maximum number.
If the third maximum does not exist, return the maximum number.

example1:
input:
6
2 10 15 6 15 3
output:
6   //third distinct maximum number

example2:
input:
5
14 14 14 13 13
14
*/
package DSA.Set;
import java.util.*;
class max3{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<Integer>v=new TreeSet<>();
        for(int i=0;i<n;i++){
            v.add(sc.nextInt());
        }
        ArrayList<Integer>d=new ArrayList<>(v);
        if(d.size()>=3){
            int max3=d.get(d.size()-3);
            System.out.println(max3);
        }
        else{
          int max=d.get(d.size()-1);
            System.out.println(max);
        }
       
        
    }
}
