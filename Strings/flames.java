
import java.util.Scanner;

public class flames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int cnt=0;
        int n=0;
        if(s1.length()>=s2.length()){
            n=s2.length();
        }
        else{
            n=s1.length();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    cnt++;
                    break;
                }
            }
        }
        int k=s1.length()+s2.length()-cnt;
        char arr[]={'f','l','a','m','e','s'};
        int res=0;
        for(int i=1;i<arr.length;i++){
            res=(res+k)%i;
        }
        System.err.println("Relation will be "+arr[res+1]);
    }
}
