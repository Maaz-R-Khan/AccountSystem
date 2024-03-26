public class Main {
    public static void main(String[] args) {

        Account act = new DebitAccount("Debit", 500);
        System.out.println(act.toString());
        act.deposit(50);
        System.out.println(act.toString());
       act.withdraw(400);
       System.out.println(act.toString());

       Account act2 = new CreditAccount("Credit", 1500);
       act.withdraw(200);
       System.out.println(act2.toString());
        act.withdraw(2000);
        System.out.println(act2.toString());

        Account act4 = new LoanAccount("Loan", 1000);
        act4.deposit(300);
        System.out.println(act4.toString());


    }
}