import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Fiyat giriniz: ");

        double paraDegeri = scr.nextDouble();
        double kdv = paraDegeri >= 0 && paraDegeri <= 1000 ? 0.18 : 0.08;
        double kdvTutar = (paraDegeri * kdv);
        double kdvFiyat = paraDegeri + kdvTutar;

        System.out.println("KDV\'siz Fiyat: " + paraDegeri);
        System.out.println("KDV\'li Fiyat: " + kdvFiyat);
        System.out.println("KDV Tutar: " + kdvTutar);
    }
}