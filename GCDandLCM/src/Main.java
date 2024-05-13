import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int gcd = 0;
        int lcd = 0;
        int i = 1;
        int k = 1;
        boolean isEnd = false;
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        while (i <= num1){
            if (num1 % i == 0 && num2 % i == 0){
                if (i > gcd){
                    gcd = i;
                }
            }
            i += 1;
        }
        while (!isEnd){
            if(k % num1 == 0 && k % num2 == 0){
                lcd = k;
                isEnd = true;
            }
            k += 1;
        }

        System.out.println("Greatest common divisor: " + gcd);
        System.out.println("Least common multiple: "+ lcd);
    }
}