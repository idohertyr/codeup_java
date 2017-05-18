import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int [][] matrix = {
                {3, 5, 6},
                {1, 2, 3},
                {4, 6, 7},
                {34, 6, 7}
        };

        System.out.println(matrix.length);
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(matrix[3][0]);
        System.out.println(matrix[0][2]);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i]);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        for (int[] row : matrix) {
            for (int number : row) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}