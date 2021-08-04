package arrays.homework3;

public class Main {

    static void printTwoDimArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},
                          {4,5,6,}};

        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matris :");
        printTwoDimArray(matrix);
        System.out.println("Tranpoze :");
        printTwoDimArray(transposeMatrix);

    }

}
