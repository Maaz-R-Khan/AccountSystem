public class LoanAccount extends Account {

    protected double interestRate;

    // Constructor
    public LoanAccount(String _AccountType, double _Balance, double interestRate) {
        // Initialize AccountType and Balance
        this.AccountType = _AccountType;
        this.Balance = _Balance;

        // Set the interest rate and apply interest
        this.interestRate = interestRate;
        applyInterest();
    }

    // Setter method for interest rate
    public void setInterestRate(double _interestRate) {
        this.interestRate = _interestRate;
    }

    // Getter method for interest rate
    public double getInterestRate() {
        return this.interestRate;
    }

    // Method to apply interest to the balance
    public void applyInterest() {
        double interest = Balance * (interestRate / 100.0);
        Balance += interest;
    }

    // Overridden withdraw method
    @Override
    public boolean withdraw(double amount) {
        // Display a message indicating withdrawal is not allowed for a Loan Account
        System.out.println("You cannot withdraw from a Loan Account.");
        return false;
    }

    // Overridden deposit method
    @Override
    public boolean deposit(double amount) {
        // Check if the deposit amount is positive
        if (amount > 0) {
            // Deduct the deposit amount from the balance
            Balance = this.Balance - amount;
            return true;
        }
        return false;
    }

}
