
import java.util.Scanner;

public class Freq_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        String m=arr[0];
        for(int i=1;i<n;i++){
            String curr=arr[i];
            int j=0;
            while( j<m.length() && j<curr.length() && m.charAt(j)==curr.charAt(j)){
                j++;
            }
            m=m.substring(0,j);
            if(m.length()==0){
                System.err.println("");
            }
            System.err.println(m);
            
        }

    }
}
