import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin Yaricapini Giriniz: ");
        double radius = scanner.nextDouble();
        System.out.print("Merkez Acisinin Olcumunu Giriniz: ");
        double 𝛼 = scanner.nextDouble();
        double result = (pi * (Math.pow(radius,2) * 𝛼) / 360);
        System.out.println("Daire diliminin alani: " + result);
    }
}