public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    static int[] duplicate(int[] arr) {
        int[] duplicate = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j && arr[i] == arr[j]) {
                    if (!isFind(duplicate, arr[j])) {
                        duplicate[i] = arr[j];
                    }
                }
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] list2 = duplicate(list);
        for (int i = 0; i < list2.length; i++) {
            if (list2[i] != 0) {
                int count = 0;
                for (int j = 0; j < list.length; j++) {
                    if (list2[i] == list[j]) {
                        count++;
                    }
                }

                System.out.println(list2[i] + " was repeated " + count + " times.");

            }
        }
    }
}