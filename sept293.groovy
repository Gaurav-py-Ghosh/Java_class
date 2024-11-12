public class sept293 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        matrix[0][0] = 5;  matrix[0][1] = 3;  matrix[0][2] = 7;  matrix[0][3] = 8;
        matrix[1][0] = 1;  matrix[1][1] = 3;  matrix[1][2] = 2;  matrix[1][3] = 5;
        matrix[2][0] = 6;  matrix[2][1] = 8;  matrix[2][2] = 2;  matrix[2][3] = 9;
        matrix[3][0] = 2;  matrix[3][1] = 5;  matrix[3][2] = 6;  matrix[3][3] = 1;

        // Swap the first row with the last row
        for(int j = 0; j < matrix[0].length; j++) {
            int temp = matrix[0][j];
            matrix[0][j] = matrix[3][j];
            matrix[3][j] = temp;
        }

        // Print the matrix to verify the swap
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
