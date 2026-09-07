public class MaxSubproduct {
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(product(arr, arr[0],arr[0],arr[0],0));
    }
    public static int product(int[] arr,int max,int min,int res,int idx){
       if(idx==arr.length){
        return res;
       }
       int cur=arr[idx];
       if(cur<0){
        int t=max;
        max=min;
        min=t;
       }
       max=Math.max(cur, cur*max);
       min=Math.min(cur, cur*min);
       res=Math.max(res, max);
       return product(arr, max, min, res, idx+1);
        }
}
