package nine;
import java.util.*; // import for Date function

public class Account {

    // creating private data fields (bullet points 1-4)
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // creating no-arg constructor (b.p. 5)
    public Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dateCreated = new Date();

    }

    // creating constructor with id and balance (b.p. 6)
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    // creating accessor and mutator methods (b.p. 7-8)
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // creating method that returns monthly interest rate (b.p. 9)
    public double getMonthlyInterestRate() {

        // using formula as specified in assignment instructions
        return annualInterestRate/12;
    }

    // creating method that returns the monthly interest (b.p. 10)
    public double getMonthlyInterest() {

        // using appropriate formula (specified in assignment instructions)
        return getMonthlyInterestRate() * this.getBalance();
    }

    // creating methods that withdraw/deposit specified amount of money (b.p. 11-12)
    public void withdraw(double money) {
        balance -= money;
    }

    public void deposit(double money) {
        balance += money;
    }
}
