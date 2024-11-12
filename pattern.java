public class pattern {
    public static void main(String[] args) {
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<i;j++){
        //         System.out.print((j+1 )*2+ " ");
        //     }
        //     System.err.println("");
        // }
        for(int i = 0; i<5; i++){
            for(int j = 0; j<(5-i);j++){
                System.out.print((j+1)*2+ " ");
            }
            System.err.println("");
        }
    }
    
    
}
