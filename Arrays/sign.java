
public class sign {
    public static int[] sign(int[] arr,int[] arr2){
  int p[]=new int[arr.length/2];
  int n[]=new int[arr.length/2];
  int j=0,k=0;
  int g=0,l=0;
  for(int i=0;i<arr.length;i++){
 
    if(arr[i]>0){
      p[j]=arr[i];
      j++;
    }
    else{
      n[k]=arr[i];
      k++;
    }
   }
   for(int i=0;i<arr.length;i++){
    int v=i;
     if(v%2==0){
      arr2[i]=p[g];
      g++;
    }else{
      arr2[i]=n[l];
      l++;
    }
   }
  return arr2;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  int arr2[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  System.out.println(Arrays.toString(sign(arr,arr2)));
 }
}
