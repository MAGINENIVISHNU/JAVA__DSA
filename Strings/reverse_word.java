
import java.util.Scanner;

class reverse_word{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String result="";
        int n=a.length();
        
        for(int i=n-1;i>=0;i--){
            if(a.charAt(i)==' '){
                result=result+a.substring(i+1,n)+" ";
                n=i;
            }
        }
        result=result+a.substring(0,n);
        System.err.println(result);
    }
}