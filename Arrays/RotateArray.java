package Arrays;
import java.util.Scanner;
public class RotateArray {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the k ");
        int k=sc.nextInt();
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void reverse(int []arr,int i,int j){
        if(i>j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverse(arr, i+1, j-1);
    }
}
