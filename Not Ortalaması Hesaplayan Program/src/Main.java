import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int mat, fizik, turkce, tarih, muzik, kimya;

        System.out.print("Matematik notunuz: ");
        mat = scr.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = scr.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = scr.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = scr.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = scr.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = scr.nextInt();

        int toplam = mat + fizik + turkce + tarih + muzik + kimya;
        double ortalama = toplam / 6;

        String sonuc = ortalama > 60 ? "Gectiniz" : "Kaldiniz";
        System.out.println("Ortalamaniz: " + ortalama + "\n" + sonuc );

    }
}