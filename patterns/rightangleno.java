import java.util.*;
public class rightangleno {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();    
        for(int k=1;k<= n;k++){
            for(int j=1; j<k;j++){
                System.out.print(j);
            }
            
            System.out.println("");
        }
    }
}

