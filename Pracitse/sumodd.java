import java.util.Scanner;

class sumodd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No:");
        int n=sc.nextInt();
        int sum=Odd(n);
        System.out.println("Sum of odd no:"+sum);
    }
    public static int Odd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                continue;
            }
            else{
                sum+=i;
            }
        }
        return sum;
    }
}