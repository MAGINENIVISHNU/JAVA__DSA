import java.util.Scanner;
class reverseno
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();    
        for(int k=n;k>= 0;k--){
            for(int j=1; j<k;j++){
                System.out.print(j);
            }
            
            System.out.println("");
        }
    }
}