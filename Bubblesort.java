public class Bubblesort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length;i++){

            for(int j = 0; j < arr.length-1-i;j++){
                int swap;
                if(arr[j]>arr[j+1]){
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
        bubbleSort(arr);
        System.out.println("\nSorted Array: ");
        for(int y : arr){
            System.out.print(y + " ");
        }
        
    }
    
}
