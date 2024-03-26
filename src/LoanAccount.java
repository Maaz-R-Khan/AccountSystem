public class LoanAccount extends Account{

    protected double interestRate;

    //Constructor
   public LoanAccount(String _AccountType, double _Balance) {
        this.AccountType = _AccountType;
        this.Balance = _Balance;
    }

    //setter
    public void setInterestRate(double _interestRate) {
      this.interestRate = _interestRate;
    }

    //getter
    public double getInterestRate() {
       return this.interestRate;
    }



    @Override
    public boolean withdraw(double amount) {
      System.out.println("You cannot withdraw ");
        return false;
    }

    @Override
   public boolean deposit(double amount) {
       if(amount > 0) {
           Balance = this.Balance - amount;
           return true;
       }
       return false;
   }


}
