public class majorityelem {
    public static int major(int[] arr,int maj){
  Arrays.sort(arr);
  int max=0;
  
    int cnt=1;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]==arr[i+1]){
      cnt++;
      if(cnt>max){
        max=cnt;
        maj=arr[i];
      }
    }else{
      cnt=1;
    }
    }
  
  return maj;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();    
  }
  System.out.println(major(arr, 0));
 }
}
