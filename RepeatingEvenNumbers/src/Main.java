public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 8, 8, 3, 2, 2, 10, 10, 1, 4, 9, 1};
        int[] duplicate = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                for (int j = 0; j < list.length; j++) {
                    if(!isFind(duplicate, list[j])) {
                        if ((i != j) && (list[i] == list[j])) {
                            duplicate[index++] = list[j];
                        }
                    }
                }
            }
        }
        for(int value: duplicate) {
            if(value != 0) {
                System.out.println(value);
            }
        }

    }
}
