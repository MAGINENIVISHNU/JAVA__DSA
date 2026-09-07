//find the max one in which rows in matrix

import java.util.Scanner;

public class max_one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int c=0;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=;j<m;j++){
                if(arr[i][j]==1){
                    c+=arr[i][j];
                    if(c>max){
                        c=max;
                    }
                }
            }
        }

    }
}
