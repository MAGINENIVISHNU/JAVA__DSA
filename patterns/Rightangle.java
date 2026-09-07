import java.util.Scanner;
class Rightangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();    
        for(int k=1;k<= n;k++){
            for(int j=0; j<k;j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}