package Java.DSA;
import java.util.HashSet;
import java.util.Scanner;
class Intersection{
    public static int intersec(int[] arr1,int[] arr2){
        HashSet<Integer>s=new HashSet<>();
        int cnt=0;
        for(int i=0;i<arr1.length;i++){
            s.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(s.contains(arr2[i])){
                cnt++;
                s.remove(arr2[i]);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(intersec(arr1, arr2));
    }
}