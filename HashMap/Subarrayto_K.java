package DSA.HashMap;
import java.util.HashMap;
import java.util.Scanner;
class Subarrayto_K{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        System.out.println("Enter the k");
        int k=sc.nextInt();
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            sum+=arr1[i];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(ans);

    }
}