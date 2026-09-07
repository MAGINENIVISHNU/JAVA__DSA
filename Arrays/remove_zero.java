import java.util.Scanner;

public class remove_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[r]=arr[i];
                r++;
            }
        }
        for(int i=r;i<n;i++){
            arr[r]=0;
            r++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
