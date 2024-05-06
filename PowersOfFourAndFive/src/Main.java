import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 1; i < number; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i < number; i *= 5) {
            System.out.print(i + " ");
        }



    }
}