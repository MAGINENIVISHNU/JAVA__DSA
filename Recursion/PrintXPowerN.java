import java.util.Scanner;

public class PrintXPowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        int n = sc.nextInt();

        System.out.print(cal(x, n));
    }

    public static double cal(double x, int n) {

        // base cases
        if (x == 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        // handle negative powers
        if (n < 0) {
            return 1 / cal(x, -n);
        }

        // recursive call
        double xpow = cal(x, n - 1);

        return x * xpow;
    }
}