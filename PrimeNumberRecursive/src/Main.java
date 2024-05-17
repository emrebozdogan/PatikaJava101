import java.util.Scanner;

public class Main {
    static int i = 2;
    static boolean isPrime(int n) {
        if (n == i){
            return true;
        }
        if (n % i != 0){
            i++;
            return isPrime(n);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int n = scan.nextInt();
        if(isPrime(n)){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
}
