import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, type;
        double firstPrice, lastPrice = 0, kmPerPrice = 0.10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance (km) : ");
        km = scanner.nextInt();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Enter the type(one way -> 1 or round trip -> 2): ");
        type = scanner.nextInt();

        firstPrice = km * kmPerPrice;

        if((km >= 0 && age >= 0) && (type == 1) ){
            if(age < 12){
                lastPrice = firstPrice / 2;
            }else if(age <= 24){
                lastPrice = firstPrice - (firstPrice * 0.1);
            }else if (age > 65) {
                lastPrice = firstPrice - (firstPrice * 0.3);
            }else {
                lastPrice = firstPrice;
            }
        }else if ((km >= 0 && age >= 0) && (type == 2)) {
            if(age < 12){
                firstPrice = firstPrice / 2;
                lastPrice = (firstPrice - (firstPrice * 0.2)) * 2;
            }else if(age <= 24){
                firstPrice = firstPrice - (firstPrice * 0.1);
                lastPrice = (firstPrice - (firstPrice * 0.2)) * 2;
            }else if (age > 65) {
                firstPrice = firstPrice - (firstPrice * 0.3);
                lastPrice = (firstPrice - (firstPrice * 0.2)) * 2;
            }else {
                lastPrice = firstPrice * 2;
            }
        }else {
            System.out.println("Wrong information.");
        }


        System.out.println("Total price for you: " + lastPrice);
    }
}