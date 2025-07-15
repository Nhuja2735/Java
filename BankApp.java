public class BankApp {
    public static void main(String[] args) {
        // Creating a new bank account
        BankAccount account1 = new BankAccount("A101", "Nhuja Maharjan", 1000.0);

        // Display initial info
        account1.displayAccountInfo();

        // Perform deposit and withdrawal
        account1.deposit(500);
        account1.withdraw(200);

        // Display updated info
        account1.displayAccountInfo();

        // Calculate interest using static method
        double interest = BankAccount.calculateInterest(account1.getBalance());
        System.out.println("Calculated Interest: $" + interest);
    }
}

