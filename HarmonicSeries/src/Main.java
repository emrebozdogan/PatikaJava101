import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double sum = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find that number's harmonic series: ");
        n = input.nextInt();

        for (double i = 1; i <= n; i++) {
            sum += 1/i;
        }
        System.out.println("Harmonic series is: " + sum);
    }
}