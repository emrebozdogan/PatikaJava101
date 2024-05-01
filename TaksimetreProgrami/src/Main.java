import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double kmBasi, gidilenKm, taksimetreAcilis, taksimetreToplam, sonuc;
        kmBasi = 2.20;
        System.out.print("Kac km gidilecek giriniz: ");
        gidilenKm = scr.nextDouble();
        taksimetreAcilis = 10;
        taksimetreToplam = (gidilenKm * kmBasi) + taksimetreAcilis;
        sonuc = taksimetreToplam <= 20 ? 20 : taksimetreToplam;

        System.out.println("Taksimetre toplam fiyat: " + sonuc);
    }
}