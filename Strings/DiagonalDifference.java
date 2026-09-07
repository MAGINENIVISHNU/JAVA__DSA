
import java.util.Scanner;

/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For a matrix arr of size n×n:

Primary diagonal: top-left to bottom-right → arr[i][i]

Secondary diagonal: top-right to bottom-left → arr[i][n-1-i]

Return the absolute difference between these two sums.

Result
=
∣
(
𝑎
𝑟
𝑟
[
0
]
[
0
]
+
𝑎
𝑟
𝑟
[
1
]
[
1
]
+
.
.
.
+
𝑎
𝑟
𝑟
[
𝑛
−
1
]
[
𝑛
−
1
]
)
−
(
𝑎
𝑟
𝑟
[
0
]
[
𝑛
−
1
]
+
𝑎
𝑟
𝑟
[
1
]
[
𝑛
−
2
]
+
.
.
.
+
𝑎
𝑟
𝑟
[
𝑛
−
1
]
[
0
]
)
∣
Result=∣(arr[0][0]+arr[1][1]+...+arr[n−1][n−1])−(arr[0][n−1]+arr[1][n−2]+...+arr[n−1][0])∣
Input Format
n
arr[0][0] arr[0][1] ... arr[0][n-1]
arr[1][0] arr[1][1] ... arr[1][n-1]
...
arr[n-1][0] arr[n-1][1] ... arr[n-1][n-1]

Output Format

Print the absolute diagonal difference.

Sample Input
3
11 2 4
4 5 6
10 8 -12

Step-by-step Explanation

Primary diagonal = 11 + 5 + (-12) = 4
Secondary diagonal = 4 + 5 + 10 = 19
Difference = |4 - 19| = 15

Sample Output
15
*/ /* 
import java.util.*;
class DiagonalDifference{
    public static void main(String []args){
         Scanner sc = new Scanner(System.in); 
            int n=sc.nextInt();
            int [][]matrix =new int[n][n];
            for(int i=0; i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]=sc.nextInt();
                    
                }
            }
            int primary=0;
            int secondary=0;
            for(int i=0;i<n;i++){
                primary+=matrix[i][i];
                secondary+=matrix[i][n-i-1];
                
            }
            int differ=Math.abs(primary-secondary);
            System.out.println(differ);
        
    }
}*/
class DiagonalDifference{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the size");
        int n=sc.nextInt();
        int [][] matrix =new int[n][n];
        System.out.println("Enter the matix values");
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int primary=0;
        int secondary=0;
        for(int i=0; i<n; i++){
            primary+=matrix[i][i];
            secondary+=matrix[i][n-i-1];
        }
        int sum=Math.abs(primary+secondary);

        int diifer=Math.abs(primary-secondary);
        System.out.println("Differrences"+diifer);
        System.err.println("Sum"+sum);
    }
}