import java.util.Scanner;

public class Plus_66 {
     public static int[] plus(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int ans[]=new int[arr.length+1];
        ans[0]=1;
        return ans;

    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int ans[]=plus(arr);
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");

    }
   }
}
