package DSA.ArrayList;


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
import java.util.*;
class thirdmax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    //    HashSet<Integer>v=new HashSet<>();
    //    for(int i=0;i<n;i++){
    //        v.add(sc.nextInt());
    //    }
    //    ArrayList<Integer>s=new ArrayList<>(v);
    //    Collections.sort(s,Collections.reverseOrder());
    //    if(s.size()>3){
    //        System.out.println(s.get(2));
    //    }
    //    else{
    //        System.out.println(s.get(0));
    //    }
    int arr1[]=new int[n];
    int arr2[]=new int[n];
    for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
    }
    Arrays.sort(arr1);
    for(int i=0;i<n-1;i++){
        if(arr1[i]!=arr1[i+1]){
            arr2[i]=arr1[i];
        }
    }
    Arrays.sort(arr2);
    if(n>3){
        System.err.println(arr2[n-2]);
    }
    else{
        System.err.println(arr2[n]);
    }


    }
}
