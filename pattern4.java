public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i<n;i++){
            for(int j =  n; j > i+1 ; j--){
                System.out.print("  ");

            }
            for(int k = 0; k<i+1;k++){
                System.out.print(k+1+" ");
            }
            for(int x = i; x>0; x--){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
       
    }
    
}
