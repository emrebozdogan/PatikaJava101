public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        double average = 0.0;
        // 1 + 1/2 + 1/3
        double sum = 0;
        for (double i : list) {
            sum = sum + (1/i);
        }
        average = list.length / sum;
        System.out.println(average);
    }
}
