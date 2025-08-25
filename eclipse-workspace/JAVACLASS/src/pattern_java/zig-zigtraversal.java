import java.util.*;
 
 public class zig-zagtraversal {
    public static void zigZagRows(int[][] matrix) {
        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Left to right
                for (int j = 0; j < matrix[i].length; j++)
                    System.out.print(matrix[i][j] + " ");
            } else {
                // Right to left
                for (int j = matrix[i].length - 1; j >= 0; j--)
                    System.out.print(matrix[i][j] + " ");
            }
        }
    }
}

