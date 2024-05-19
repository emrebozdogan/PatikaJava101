import java.util.Scanner;

public class Main {
    static int[] makeArray(int length){
        Scanner scn = new Scanner(System.in);
        int[] array = new int[length];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter " + (i+1) + ". value: " );
            int value = scn.nextInt();
            array[i] = value;
        }


        return array;
    }
    static int[] SortedArray(int length){
        int[] array = makeArray(length);
        for(int i = 0; i < array.length; i++){
            int temp = 0;
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scn.nextInt();
        for(int value : SortedArray(length)){
            System.out.print(value + " ");
        }
    }
}
