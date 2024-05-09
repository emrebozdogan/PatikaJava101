import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int balance = 1500;
        int right = 3;
        int select;

        while (right > 0) {
            System.out.print("Please enter your username: ");
            userName = input.nextLine();
            System.out.print("Please enter your password: ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to the X Bank!");
                do {
                    System.out.println("1- Deposit money\n" +
                            "2- Withdraw money\n" +
                            "3- Check balance\n" +
                            "4- Exit");
                    System.out.print("Please enter what you want to do: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Enter the amount money to deposit: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Your process is complete");
                            break;
                        case 2:
                            System.out.print("Enter the amount money to withdraw: ");
                            int price2 = input.nextInt();
                            if(balance > price2) {
                                balance -= price2;
                                System.out.println("Your process is complete");
                            }else {
                                System.out.println("Your balance is not enough.");
                            }
                            break;
                        case 3:
                            System.out.println("Your balance is: " + balance);
                    }
                }while(select != 4);
                System.out.println("Successfully exited.");
                break;
            }else{
                right--;
                System.out.println("Incorrect username or password please try again");
                if (right == 0) {
                    System.out.println("Your account is blocked please interact with the X Bank!");
                }else{
                    System.out.println("You have " + right + " rights remain");
                }
            }
        }
    }
}