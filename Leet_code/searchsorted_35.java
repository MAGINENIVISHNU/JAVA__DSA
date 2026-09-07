package DSA.Leet_code;

import java.util.Scanner;

public class searchsorted_35 {
     public static int search(int [] nums,int target){
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=(i+(j-i)/2);
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                j=mid-1;
            }
            else if(target>nums[mid]){
                i=mid+1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Target");
        int target=sc.nextInt();
        System.out.println(search(nums, target));
    }
}
