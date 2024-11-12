public class array2d {
    public static void main(String[] args) {
        int[][] matrix = {{2,5,3,6},{1,3,2,5},{6,8,2,9}};
        int sum=0;
        for (int[] matrix1 : matrix) {
            for (int element : matrix1) {
                sum += element;
            }
        }
    System.out.println("sum: " + sum);
    
}
}