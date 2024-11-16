



public class SelectionSort
{   
    public static void sorting(int[] x) {
        
        for(int i = 0; i<x.length; i++){
            int min = x[i];
            for(int j = i; j<x.length; j++){
                if(x[j] < x[i]){
                    min = x[j];
                    x[j] = x[i];
                    x[i] = min;
                }
            }
                
        }
        
    }


    public static void main(String[] args) {
        int [] x = {22,7,3,1,2};
        System.out.println("Before Sorting: ");
        for(int i : x){
            System.out.print(i + " ");
        }
        sorting(x);
        System.out.println("\nAfter Sorting: ");
        for(int i : x){
            System.out.print(i + " ");
        }
    }







}


