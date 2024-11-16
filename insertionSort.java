public class insertionSort {
    // Method to perform Insertion Sort
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Shift elements of the sorted part of the array that are greater than 'key'
            // to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            // Insert the 'key' into its correct position
            array[j + 1] = key;
        }
    }

    // Method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("Sorted Array:");
        printArray(numbers);
    }
}
