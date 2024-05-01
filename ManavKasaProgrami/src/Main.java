import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double armut = 2.14, armutKg, elma = 3.67, elmaKg, domates = 1.11, domatesKg, muz = 0.95, muzKg, patlican = 5.0, patlicanKg, toplam;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut kac kilo: ");
        armutKg = scanner.nextDouble();

        System.out.print("Elma kac kilo: ");
        elmaKg = scanner.nextDouble();

        System.out.print("Domates kac kilo: ");
        domatesKg = scanner.nextDouble();

        System.out.print("Muz kac kilo: ");
        muzKg = scanner.nextDouble();

        System.out.print("Patlican kac kilo: ");
        patlicanKg = scanner.nextDouble();

        toplam = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);

        System.out.println("Toplam tutar: " + toplam);
    }
}