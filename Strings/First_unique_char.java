import java.util.Scanner;

class First_unique_char{
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        System.out.println(first(a));
    }
    public static int first(String a){
         int arr[]=new int[26];
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            int idx=a.charAt(i)-'a';
            arr[idx]++;
        }
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            int idx=a.charAt(i)-'a';
            if(arr[idx]==1){
                return i;
            }
        }
        return -1;           
    }
}