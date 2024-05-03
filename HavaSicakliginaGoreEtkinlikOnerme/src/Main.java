import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner scr = new Scanner(System.in);

        System.out.print("Sicaklik giriniz: ");
        sicaklik = scr.nextInt();

        if(sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if(sicaklik < 25){
            if(sicaklik <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }if (sicaklik >= 10){
                System.out.println("Piknik yapabilirsiniz.");
            }
        }else {
            System.out.println("Yuzmeye gidebilirsiniz.");
        }
    }
}