package CustomExceptions;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount account = new BankAccount(1000);

        // Demonstrate scenarios
        try {
            // Successful withdrawal
            account.withdraw(500);
            // Attempting to withdraw more than balance
            account.withdraw(600);
            // Attempting to withdraw a negative amount
            account.withdraw(-200);
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
