class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Please enter a valid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(101, "Rahul", 5000);
        BankAccount account2 = new BankAccount(102, "Aman", 8000);

        System.out.println("Account 1");
        account1.deposit(2000);
        account1.withdraw(1000);
        account1.checkBalance();

        System.out.println("\nAccount 2");
        account2.deposit(3000);
        account2.withdraw(2000);
        account2.checkBalance();

        System.out.println("\nFinal account details");

        System.out.println("\nFirst account:");
        account1.displayDetails();

        System.out.println("\nSecond account:");
        account2.displayDetails();
    }
}
