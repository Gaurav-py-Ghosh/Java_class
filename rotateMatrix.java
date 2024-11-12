public class rotateMatrix{
    public static void main(String[] args) {
        // Your code here
    

    
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int k = 0; k < n; k++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = matrix[k][start];
                matrix[k][start] = matrix[k][end];
                matrix[k][end] = temp;
                start++;
                end--;
            }
        }

        // Print the rotated matrix
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }
}
