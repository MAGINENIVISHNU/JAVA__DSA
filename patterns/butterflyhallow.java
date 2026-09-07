import java.util.Scanner;

public class butterflyhallow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i   ){
                System.out.print("*");}
                else{
                    System.err.print(" ");
                }
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==i || j==1 ){
                System.err.print("*");}
             else{
                    System.err.print(" ");
                }   
            }
            System.err.println("");
        }
      
              
         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                System.out.print("*");}
                else{
                    System.err.print(" ");
                }
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==i || j==1){
                System.err.print("*");}
             else{
                    System.err.print(" ");
                }   
            }
            System.err.println("");
        }
      
              


    }
}
