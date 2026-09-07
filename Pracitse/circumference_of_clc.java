
import java.util.Scanner;

public class circumference_of_clc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        int r=sc.nextInt();
        circumference(r);
        System.out.println("circumference of circle"+circumference(r));
    }
    public static double circumference(int r){
        return 2*3.14*r;
    }
}
