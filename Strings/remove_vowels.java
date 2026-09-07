import java.util.Scanner;

public class remove_vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'|| a.charAt(i)=='e' ||a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                continue;
            }else{
                b.append(a.charAt(i));
            }
        }
        System.out.println(b);
    }
}
