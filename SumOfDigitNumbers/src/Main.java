import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to sum digits: ");
        int number = input.nextInt();
        int digit, sum = 0;

        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            sum = sum + digit;
        }
        System.out.println("The sum of the digits: " + sum);
    }
}