import java.util.Scanner;

public class Main {
    static void Pattern(int n){
        System.out.print(n + " ");

        if (n <= 0)
        {
            return;
        }

        Pattern(n - 5);

        if (n > 0)
        {
            System.out.print(n + " ");
        }

    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        Pattern(n);

    }

}
