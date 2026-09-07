package DSA.HashMap;
import java.util.HashMap;
import java.util.Scanner;
class Majority{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        majorityelem(arr1);
    }
    public static void majorityelem(int[] arr1){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i], map.get(arr1[i])+1);
            }else{
                map.put(arr1[i],1);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i)>arr1.length/3){
                System.out.println(i);
            }
        }
    }
}

