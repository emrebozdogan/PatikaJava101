import java.util.Scanner;

public class Main {
    static void Plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number: ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result: " + result);
    }

    static void Minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. number: ");
        int a = scan.nextInt();
        System.out.print("2. number: ");
        int b = scan.nextInt();
        System.out.println(a - b);
    }

    static void Times() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. number: ");
        int a = scan.nextInt();
        System.out.print("2. number: ");
        int b = scan.nextInt();
        System.out.println(a * b);
    }

    static void Divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. number: ");
        double a = scan.nextInt();
        System.out.print("2. number: ");
        double b = scan.nextInt();
        System.out.println(a / b);
    }

    static void Power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. number: ");
        int a = scan.nextInt();
        System.out.print("2. number: ");
        int b = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(result);
    }

    static void Factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. number: ");
        int a = scan.nextInt();

        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    static void Mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. number: ");
        int a = scan.nextInt();
        System.out.print("2. number: ");
        int b = scan.nextInt();
        System.out.println(a % b);
    }

    static void RectangularAreaAndPerimeter() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. number: ");
        int a = scan.nextInt();
        System.out.print("2. number: ");
        int b = scan.nextInt();
        System.out.println("Area: " + (a * b));
        System.out.println("Perimeter: " + ((a * 2) + (b * 2)));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition Operation\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponent Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Mode Import\n"
                + "8- Rectangle Area and Perimeter Calculation\n"
                + "0 - Log Out";

        System.out.println(menu);
        System.out.print("Please enter a number: ");
        select = scan.nextInt();
        while (select != 0) {
            System.out.print("Please enter a number: ");
            select = scan.nextInt();
            switch (select) {
                case 0:
                    break;
                case 1:
                    Plus();
                    break;
                case 2:
                    Minus();
                    break;
                case 3:
                    Times();
                    break;
                case 4:
                    Divided();
                    break;
                case 5:
                    Power();
                    break;
                case 6:
                    Factorial();
                    break;
                case 7:
                    Mod();
                    break;
                case 8:
                    RectangularAreaAndPerimeter();
                    break;
                default:
                    System.out.println("Wrong number please try again!");
            }
        }

    }
}
