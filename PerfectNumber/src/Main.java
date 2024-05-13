import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number){
            System.out.println(number + " is a perfect number!");
        }else{
            System.out.println(number + " is not a perfect number!");
        }
    }
}