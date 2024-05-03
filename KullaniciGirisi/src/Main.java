import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, username2, password2, newPassword;
        String choiceStr;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanici adi olusturunuz: ");
        username = scanner.nextLine();
        System.out.print("Sifre olusturunuz: ");
        password = scanner.nextLine();

        System.out.print("Kullanici adinizi giriniz: ");
        username2 = scanner.nextLine();
        System.out.print("Sifrenizi giriniz: ");
        password2 = scanner.nextLine();

        if ((username.equals(username2)) && (password.equals(password2))) {
            System.out.println("Basariyla giris yaptiniz!");
        }else {
            if(password.equals(password2)) {
                System.out.println("Giris basarisiz! Kullanici adiniz yanlis.");
            }else {
                System.out.println("Giris basarisiz! Sifreniz yanlis.");
                System.out.print("Sifrenizi sifirlamak istiyorsaniz 1, istemiyorsaniz 2 yaziniz: ");
                choiceStr = scanner.nextLine();
                int choice = Integer.parseInt(choiceStr);
                if(choice == 1) {
                    System.out.print("Yeni sifrenizi giriniz: ");
                    newPassword = scanner.nextLine();
                    if(newPassword.equals(password)){
                        System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                    }else {
                        System.out.println("Sifre olusturuldu.");
                    }
                }else if (choice == 2) {
                    System.out.println("Sifreniz sifirlanmadi.");
                }else{
                    System.out.println("Lutfen 1 ya da 2 degerlerinden birini giriniz.");
                }
            }
        }
    }
}