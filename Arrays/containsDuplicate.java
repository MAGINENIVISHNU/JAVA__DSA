package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class containsDuplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println(duplicate(arr));
    }
    public static boolean duplicate(int [] arr){
        if(arr.length==1){
            return false;
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
