import java.util.Scanner;
public class scaning {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            System.out.println("Enter your address:");
            String address = scanner.nextLine();


            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
        }

    
        
    }
    
}
