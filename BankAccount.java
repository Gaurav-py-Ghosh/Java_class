public class BankAccount {
    int accountNumber;
    String holderName;
    int balance;

   
    public BankAccount(int aN, String HN, int Bal) {
        accountNumber = aN;
        holderName = HN;
        balance = Bal;
    }

  
    void withdraw(int money) {
        if (money > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= money;
            System.out.println(money + " withdrawn successfully.");
        }
    }

    
    void deposit(int money) {
        balance += money;
        System.out.println(money + " deposited successfully.");
    }

    
    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1234, "Gaurav", 1000);
        
       
        account.withdraw(500);
        account.displayBalance();
        
        
        account.deposit(300);
        account.displayBalance();
    }
}
