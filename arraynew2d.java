public class arraynew2d {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        matrix[0][0] = 2;  matrix[0][1] = 5;  matrix[0][2] = 3;  matrix[0][3] = 6;
        matrix[1][0] = 1;  matrix[1][1] = 3;  matrix[1][2] = 2;  matrix[1][3] = 5;
        matrix[2][0] = 6;  matrix[2][1] = 8;  matrix[2][2] = 2;  matrix[2][3] = 9;

        int sum = 0;
        for (int[] matrix1 : matrix) {
            for (int element : matrix1) {
                sum += element;
            }
        }
        
        System.out.println("Sum: " + sum);
    }
}
