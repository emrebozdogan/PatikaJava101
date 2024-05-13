import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int base = input.nextInt();
        int rule = (base*2)-1;

        for (int i = 0; i < base; i++) {
            for (int j = 0; j < rule; j++) {
                System.out.print("*");
            }
            rule -= 2;
            System.out.println();
        }
    }
}