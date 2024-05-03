import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();
        if(mat < 0 || mat > 100){
            mat = 0;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();
        if(fizik < 0 || fizik > 100){
            fizik = 0;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();
        if(kimya < 0 || kimya > 100){
            kimya = 0;
        }

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = scanner.nextInt();
        if(turkce < 0 || turkce > 100){
            turkce = 0;
        }

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = scanner.nextInt();
        if(muzik < 0 || muzik > 100){
            muzik = 0;
        }

        double average = (mat + fizik + kimya + turkce + muzik) / 5;

        if (average <= 55){
            System.out.println("Sinifi gecemediniz!");
        }else{
            System.out.println("Tebrikler sinifi gectiniz!");
        }

        System.out.println("Ortalamaniz: " + average);



    }
}