import java.util.Scanner;

class average_f{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Average(a,b,c);
        System.out.println("Average of no:"+Average(a,b,c));
    }
    public static int Average(int a, int b,int c){
        return (a+b+c)/3;
    }
}