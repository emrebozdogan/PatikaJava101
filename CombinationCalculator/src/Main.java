import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number for C(n,r): ");
        int n = scan.nextInt();
        System.out.print("Enter second number for C(n,r): ");
        int r = scan.nextInt();

        int total1 = 1;
        int total2 = 1;
        int total3 = 1;

        for (int i = 1; i <= n; i++) {
            total1 *= i;
        }

        for (int j = 1; j <= r; j++) {
            total2 *= j;
        }

        for (int k = 1; k <= n-r; k++) {
            total3 *= k;
        }

        System.out.println("C(" + n + ',' + r + ")=" + total1 / (total2 * (total3)));

    }
}