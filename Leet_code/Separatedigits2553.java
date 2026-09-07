package DSA.Leet_code;
class separatedigits2553{
    public static int[] separate(int[] arr){
        ArrayList<Integer> v=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            while(i>0){
                int m=i%10;
                i=i/10;
                v.add(m);
            }
        }
        int result[]=new int[v.size()];
        for(int i=0;i<v.size();i++){
            result[i]=v.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(separate(arr).toString());
    }
}