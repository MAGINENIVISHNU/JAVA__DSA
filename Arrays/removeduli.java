
import java.util.Arrays;
import java.util.Scanner;

public class removeduli {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr2[i]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            System.err.println(arr2[i]);
        }
    }
}
