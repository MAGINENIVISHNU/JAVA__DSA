
import java.util.Scanner;

public class anagram_asrra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s1[]=new String[n];
        String s2[]=new String[m];
        if(n!=m){
            System.out.println("fails");
            System.exit(0);
        }
        for(int i=0;i<n;i++){
            s1[i]=sc.next();
        }
        for(int i=0;i<m;i++){
            s2[i]=sc.next();
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s1[i].equals(s2[j])){
                    c++;
                }
            }
        }
        if(c==n){
            System.out.println("True");
        }else{
            System.err.println("Fail");
        }
    }
}
