import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, total = 1;
        System.out.print("Enter number to be exponentiated: ");
        num1 = scanner.nextInt();
        System.out.print("Enter number to be exponent: ");
        num2 = scanner.nextInt();

        for (int i = 0; i < num2; i++) {
            total *= num1;
        }
        System.out.println("Result: " + total);

    }
}