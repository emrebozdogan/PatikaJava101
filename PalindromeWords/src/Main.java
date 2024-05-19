import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str){
        String reverse = "";
        for (int i = str.length() -1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        if(reverse.equals(str)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a word to check if it is palindrome or not: ");
        String word = scn.nextLine();
        System.out.println(isPalindrome(word));

    }
}
