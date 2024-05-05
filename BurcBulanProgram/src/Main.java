import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String zodiac = "";
        boolean isError = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the month of your birth date (using 1,2,3...): ");
        month = sc.nextInt();

        System.out.print("Please enter the day of your birth date: ");
        day = sc.nextInt();

        if (month == 1) {
            if (day >= 0 && day <= 31) {
                if (day <= 21){
                    zodiac = "Oglak";
                }else{
                    zodiac = "Kova";
                }
            }else{
                isError = true;
            }
        }else if (month == 2){
            if (day >= 0 && day <= 28) {
                if (day <= 19){
                    zodiac = "Kova";
                }else{
                    zodiac = "Balik";
                }
            }else{
                isError = true;
            }
        }else if (month == 3){
            if (day >= 0 && day <= 31) {
                if (day <= 20){
                    zodiac = "Balik";
                }else{
                    zodiac = "Koc";
                }
            }else{
                isError = true;
            }
        }else if (month == 4){
            if (day >= 0 && day <= 30) {
                if (day <= 20){
                    zodiac = "Koc";
                }else{
                    zodiac = "Boga";
                }
            }else{
                isError = true;
            }
        }else if (month == 5){
            if (day >= 0 && day <= 31) {
                if (day <= 21){
                    zodiac = "Boga";
                }else{
                    zodiac = "Ikizler";
                }
            }else{
                isError = true;
            }
        }else if (month == 6){
            if (day >= 0 && day <= 30) {
                if (day <= 22){
                    zodiac = "Ikizler";
                }else{
                    zodiac = "Yengec";
                }
            }else{
                isError = true;
            }
        }else if (month == 7){
            if (day >= 0 && day <= 31) {
                if (day <= 22){
                    zodiac = "Yengec";
                }else{
                    zodiac = "Aslan";
                }
            }else{
                isError = true;
            }
        }else if (month == 8){
            if (day >= 0 && day <= 31) {
                if (day <= 22){
                    zodiac = "Aslan";
                }else{
                    zodiac = "Basak";
                }
            }else{
                isError = true;
            }
        }else if (month == 9){
            if (day >= 0 && day <= 30) {
                if (day <= 22){
                    zodiac = "Basak";
                }else{
                    zodiac = "Terazi";
                }
            }else{
                isError = true;
            }
        }else if (month == 10){
            if (day >= 0 && day <= 31) {
                if (day <= 22){
                    zodiac = "Terazi";
                }else{
                    zodiac = "Akrep";
                }
            }else{
                isError = true;
            }
        }else if (month == 11){
            if (day >= 0 && day <= 30) {
                if (day <= 21){
                    zodiac = "Akrep";
                }else{
                    zodiac = "Yay";
                }
            }else{
                isError = true;
            }
        }else if (month == 12){
            if (day >= 0 && day <= 31) {
                if (day <= 21){
                    zodiac = "Yay";
                }else{
                    zodiac = "Oglak";
                }
            }else{
                isError = true;
            }
        }else{
            isError = true;
        }


        if (isError){
            System.out.println("Girdiginiz degerler hatali.");
        }else{
            System.out.println("Burcunuz: " + zodiac);
        }
    }
}