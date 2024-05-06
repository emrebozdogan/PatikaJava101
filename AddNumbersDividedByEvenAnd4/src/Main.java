import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a even number: ");
        number = input.nextInt();

        while (number % 2 == 0){
            System.out.print("Enter a even number (enter a odd number if you want to end loop): ");
            number = input.nextInt();
            if (number % 4 == 0){
                total += number;
            }
        }
        System.out.println("The sum of the values you entered(if its even and can be divided by 4): " + total);
    }
}