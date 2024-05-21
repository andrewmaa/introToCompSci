package eight;

public class problem1 {
    public static void main(String[] args) {

        // create new account object from Account class with specified id and balance from assignment instructions
        Account myAccount = new Account(1122, 20000.00);

        // set annual interest rate to 4.5% (0.045)
        myAccount.setAnnualInterestRate(0.045);

        // withdraw 2500 and then deposit 3000 into the account
        myAccount.withdraw(2500);
        myAccount.deposit(3000);

        // print final balance and monthly interest
        System.out.println("Balance: $" + myAccount.getBalance());
        System.out.println("Monthly Interest: " + myAccount.getMonthlyInterest());
    }
}
