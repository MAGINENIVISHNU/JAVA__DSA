package JAVA.DSA.Arrays;

import java.util.Scanner;

public class spiral {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  //size of rows
        int m=sc.nextInt();  //size of col
        int spir[][]=new int[n][m];  //declaration of 2D array
        //taking values from user
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                spir[i][j]=sc.nextInt(); //using scanner function
            }
        }
        int rowStart=0, rowEnd=n-1; 
        int colStart=0 ,colEnd=m-1;
        //condition for spiral
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i=colStart; i<=colEnd; i++){
                System.out.print(spir[rowStart][i]+" ");
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++){
                System.out.print(spir[i][colEnd]+" ");
            }
            colEnd--;
            if (rowStart <= rowEnd){
            for(int i=colEnd;i>=colStart;i--){
                System.out.print(spir[rowEnd][i]+" ");
            }
        }
            rowEnd--;
            if (colStart <= colEnd){
            for(int i=rowEnd;i>=rowStart;i--){
                System.out.print(spir[i][colStart]+" ");
            }
        }
            colStart++;
            System.err.println(" ");
        }

    }
}
