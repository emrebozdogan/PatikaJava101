import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, choose, sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz: ");
        n1 = scanner.nextInt();
        System.out.print("Ikinici sayiyi giriniz: ");
        n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Yapmak istediginiz islemi giriniz: ");
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                sonuc = n1 + n2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc = n1 - n2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc = n1 * n2;
                System.out.println(sonuc);
                break;
            case 4:
                if(n2 != 0) {
                    sonuc = n1 / n2;
                    System.out.println(sonuc);
                }else {
                    System.out.println("Bir sayi 0'a bolunemez");
                }
                break;
            default:
                System.out.println("Lutfen 1 ile 4 arasinda bir islem numarasi giriniz.");
        }

    }
}