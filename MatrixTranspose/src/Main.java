public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4},
                {5, 6, 4}};

        int k = matrix.length;
        int n = 0;
        for(int i = 0; i < 1; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                n++;
            }
        }

        int[][] transposeMatrix = new int[n][k];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        for(int[] i : transposeMatrix) {
            for(int value : i){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
