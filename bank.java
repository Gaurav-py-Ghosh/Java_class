import java.util.Scanner;
class Account{
    int accountNumber;
    String accountHolderName;
    double balance;
    static int totalAccount = 0;
    final double interestRate = 0.05;


    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccount++;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println(amount + "deposited successfully");
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println(amount + "withdrawn successfully");
    }

    public void displayAccountDetails(){
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Account Holder Name:"+accountHolderName);
        System.out.println("current Balance:"+ balance);
    }

        public static int getTotalAccounts() {
        return totalAccount;
    }

}

class SavingsAccount extends Account{
     public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override 
    public void withdraw(double amount){
         if (amount > 0 && balance - amount >= 1000) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or minimum balance requirement not met.");
        }
    }
}

public class bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = null;

        while (true) {
            // Display menu options
            System.out.println("\nBank Account Management System");
            System.out.println("1: Create Savings Account");
            System.out.println("2: Deposit Money");
            System.out.println("3: Withdraw Money");
            System.out.println("4: Display Account Details");
            System.out.println("5: Display Total Accounts Created");
            System.out.println("6: Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline character

            switch (choice) {
                case 1: // Create Savings Account
                    System.out.print("Enter Account Number: ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Account Holder Name: ");
                    String accountHolderName = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    account = new SavingsAccount(accountNumber, accountHolderName, balance);
                    System.out.println("Savings Account created successfully.");
                    break;

                case 2: 
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("No account exists. Please create an account first.");
                    }
                    break;

                case 3: 
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account exists. Please create an account first.");
                    }
                    break;

                case 4: 
                    if (account != null) {
                        account.displayAccountDetails();
                    } else {
                        System.out.println("No account exists. Please create an account first.");
                    }
                    break;

                case 5: 
                    System.out.println("Total Accounts Created: " + Account.getTotalAccounts());
                    break;

                case 6: 
                    System.out.println("Exiting the system.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}