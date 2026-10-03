import java.util.*;
public class Maximum_No_Vowels_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next().toLowerCase();
        int k=sc.nextInt();
        System.out.println(Maximumvowel(a,k));
    }
    public static int Maximumvowel(String a,int k){
        int cnt=0;
        for(int i=0;i<k;i++){
            if(isVowel(a.charAt(i))){
                cnt++;
            }
        }
        int max=cnt;
        for(int i=k;i<a.length();i++){
            if(isVowel(a.charAt(i))){
                cnt++;
            }
            if(isVowel(a.charAt(i-k))){
                cnt--;
            }
            max=Math.max(max, cnt);
        }
        return max;
    }
    private static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
