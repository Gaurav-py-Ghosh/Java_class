import java.util.*;
public class int4 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int[] x = new int[4];
            System.out.println("Enter Four integers to create an array");
            // for (int i = 0; i <4;i++){
            //     int in = s.nextInt();
            //     x[i] = in;

            // }
   int i = 0;  
   while(s.hasNextInt()){
            x[i] = s.nextInt();
            i++;
            if(i == 4) break;
   }
   
   //print out the array
            System.out.println("The array:");
            for(int j = 0; j < x.length; j++){
                System.out.print(x[j] + " ");
            }
        }
   
    
}
}
