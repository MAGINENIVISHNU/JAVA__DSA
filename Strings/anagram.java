import java.util.Scanner;

class anagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int c=0;
        if(s1.length()!=s2.length()){
             System.err.println("False");
             System.exit(0);
        }
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    c++;
                    break;
                }
            }
        }
        if(c==s1.length()){
            System.err.println("True");
        }
        else{
            System.err.println("False");
        }
        //other method
    //        char ch1[]=s1.toCharArray();
    // char ch2[]=s2.toCharArray();
    // Arrays.sort(ch1);
    // Arrays.sort(ch2);
    // for(int i=0;i<s1.length();i++){
    //     if(ch1[i]!=ch2[i]){
    //         System.out.println(false);
    //         return;
    //     }
    // }
    // System.out.println(true);
   

    }
}