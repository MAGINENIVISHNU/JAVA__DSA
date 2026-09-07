
import java.util.Scanner;

public class count_vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        a=a.toLowerCase();
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                c++;
            }
        }
        System.out.println(c);

    }
}
