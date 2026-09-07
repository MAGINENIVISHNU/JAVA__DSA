package DSA.Leet_code;

import java.util.Scanner;

public class firstandlast_34 {
     public static int[] searchRange(int[] nums, int target) {
       int cnt=0;
       boolean r=true;
       int k=0;
       int res[]=new int[2];
       for(int i=0;i<nums.length;i++){
        if(nums[i]==target && r){
            res[k++]=i;
            cnt++;
            r=false;
        }
        else if(nums[i]!=target && r!=true){
            r=true;
            if(cnt==1){
                res[k]=i-1;
                cnt++;
                break;
            }
        }
       }
       if(cnt==1){
            res[k]=nums.length-1;
        }
        if(cnt==0){
            for(int i=0;i<2;i++){
            res[i]=-1;
        }
       }
       return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.err.println("Target");
        int target=sc.nextInt();
        int ans[]=searchRange(nums,target);
        for(int i=0;i<ans.length;i++){
            System.err.print(ans[i]+" ");
        }
    }
}
