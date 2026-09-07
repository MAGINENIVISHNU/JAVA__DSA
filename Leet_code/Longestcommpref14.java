import java.util.Scanner;

public class Longestcommpref14 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        int cnt=0;
        String b="";
        //Arrays.sort(a);
        for(int j=0;j<a[0].length();j++){
            boolean flag=true;
                for(int i=1;i<n;i++){
                    if(j>a[i].length()|| a[0].charAt(j)!=a[i].charAt(j)){
                        flag=false;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
                cnt++;
        }
        b += a[0].substring(0, cnt);
        System.out.println(b);
    }
}
