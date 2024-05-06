import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, average = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();


        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                average += i;
            }
        }

        System.out.println(average);
    }
}