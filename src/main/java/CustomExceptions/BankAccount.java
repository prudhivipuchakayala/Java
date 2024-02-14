package CustomExceptions;

// BankAccount class
public class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        if (amount < 0) {
            throw new InvalidWithdrawalException("Invalid withdrawal amount: " + amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Cannot withdraw $" + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}
