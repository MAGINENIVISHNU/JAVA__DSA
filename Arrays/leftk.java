public class leftk {
     public static int[] leftk(int[] arr,int[] arr2,int k){
        int temp[]=new int[arr.length];
        int v=0,j=0;
        for(int i=0;i<k;i++){
            temp[v]=arr[i];
            v++;
        }
        for(int i=k;i<arr.length;i++){
            arr2[j]=arr[i];
            j++;
        }
        for(int i=0;i<v;i++){
            arr2[j]=temp[i];
            j++;
        }
        return arr2;        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int arr2[]=new int[n];
        int k=sc.nextInt();
          System.out.println(Arrays.toString(leftk(arr, arr2, k)));

    }
}
