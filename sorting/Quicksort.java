import java.util.*;
public class Quicksort {
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int[] arr,int sm,int la){
        if(sm<la){
            int pidx=provid(arr,sm,la);
            quicksort(arr, sm, pidx-1);
            quicksort(arr, pidx+1, la);
        }
    }
    public static int provid(int[] arr,int sm,int la){
        int i=sm-1;
        int pr=arr[la];
        for(int j=sm;j<la;j++){
            if(arr[j]<pr){
                int temp=arr[++i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pr;
        arr[la]=temp;
        return i;
    }
}
