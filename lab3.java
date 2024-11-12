public class lab3 {
    public static void main(String[] args) {
        int[] a={34, 2, 45, 56, 23};
        int[] b={12, 5, 23, 54, 34};
        int[] c =new int[5];
        for(int i =0; i< a.length;i++ ){
          c[i]=a[i] + b[i];
        

        }
        System.out.print("new array:");
        for(int i =0; i< a.length;i++ ){
            System.out.print(c[i]+" ");
          
  
          }
    System.err.println("");  
    }
    
}
