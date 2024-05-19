import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int nearestMin = 0, nearestMax = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        Arrays.sort(list);
        for (int i : list) {
            if (i < number){
                nearestMin = i;
            }
        }
        for (int k : list) {
            if (k > number){
                nearestMax = k;
                break;
            }
        }
        System.out.println("Nearest min: " + nearestMin);
        System.out.println("Nearest max: " + nearestMax);
    }
}
