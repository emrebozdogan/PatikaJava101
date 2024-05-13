import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements of the Fibonacci series: ");
        int number = input.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < number; i++) {
            System.out.print(a + " ");
            int total = a + b;
            a = b;
            b = total;
        }
    }
}