import java.util.Scanner;

public class Main {
    static int Power(int a, int b){

        int result = 1;

        if (b == 0){
            return result;
        }
        return Power(a, b-1) * a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base value : ");
        int a = scan.nextInt();
        System.out.print("Enter exponent value : ");
        int b = scan.nextInt();

        System.out.println(Power(a,b));

    }
}
