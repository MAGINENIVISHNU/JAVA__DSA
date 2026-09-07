import java.util.Scanner;

class Break{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        String user="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='@'){
                break;
            }
            else{
                user+=word.charAt(i);
            }
        }
        System.out.println(user);
    }    
}