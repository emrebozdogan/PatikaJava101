import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int howMany, max = 0, min = 0;
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter: ");
        howMany = input.nextInt();
        while (i <= howMany) {
            int number;
            System.out.print("Enter the " + i + ". number: ");
            number = input.nextInt();
            if (number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
            i += 1;
        }
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }
}