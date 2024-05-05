import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthYear;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        birthYear = scanner.nextInt();

        switch (birthYear % 12){
            case 0:
                System.out.println("Your Chinese zodiac is Monkey");
                break;
            case 1:
                System.out.println("Your Chinese zodiac is Rooster");
                break;
            case 2:
                System.out.println("Your Chinese zodiac is Dog");
                break;
            case 3:
                System.out.println("Your Chinese zodiac is Pig");
                break;
            case 4:
                System.out.println("Your Chinese zodiac is Rat");
                break;
            case 5:
                System.out.println("Your Chinese zodiac is Ox");
                break;
            case 6:
                System.out.println("Your Chinese zodiac is Tiger");
                break;
            case 7:
                System.out.println("Your Chinese zodiac is Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese zodiac is Dragon");
                break;
            case 9:
                System.out.println("Your Chinese zodiac is Snake");
                break;
            case 10:
                System.out.println("Your Chinese zodiac is Horse");
                break;
            case 11:
                System.out.println("Your Chinese zodiac is Goat");
                break;
        }
    }
}