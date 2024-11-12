import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter username");

        String username = obj.nextLine();

        System.err.println("Your Name is:"+ username);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(arr[2]);

    }

    
}
