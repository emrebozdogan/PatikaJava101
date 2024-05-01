import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kenar1, kenar2, kenar3, alan, cevre;
        Scanner scr = new Scanner(System.in);
        System.out.print("Ilk kenari giriniz: ");
        kenar1 = scr.nextDouble();
        System.out.print("Ikinci kenari giriniz: ");
        kenar2 = scr.nextDouble();
        System.out.print("Ucuncu kenari giriniz: ");
        kenar3 = scr.nextDouble();

        cevre = kenar1 + kenar2 + kenar3;
        double u = cevre / 2;
        alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Girdiginiz degerlere gore olusan ucgenin alani: " +alan);

    }
}