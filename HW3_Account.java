package Chapter9;
import java.util.Date;

public class HW3_Account {
    private int id;
    private double balance;
    private double annualInterestRate; // percent, e.g., 4.5
    private final Date dateCreated;

    // No-arg constructor delegates to two-arg
    public HW3_Account() {
        this(0, 0.0);
    }

    // Two-arg constructor: set id, balance, and creation date
    public HW3_Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public double getAnnualInterestRate() { return annualInterestRate; }
    public void setAnnualInterestRate(double annualInterestRate) { this.annualInterestRate = annualInterestRate; }

    public Date getDateCreated() { return new Date(dateCreated.getTime()); }

    public double getMonthlyInterestRate() { return (annualInterestRate / 100.0) / 12.0; }
    public double getMonthlyInterest() { return balance * getMonthlyInterestRate(); }

    public void withdraw(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount must be non-negative.");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds.");
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount must be non-negative.");
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account{id=" + id +
               ", balance=" + balance +
               ", annualInterestRate=" + annualInterestRate +
               "%, dateCreated=" + dateCreated + "}";
    }

    public static void main(String[] args) {
        HW3_Account acct = new HW3_Account(1122, 20000);
        acct.setAnnualInterestRate(4.5);
        acct.withdraw(2500);
        acct.deposit(3000);

        System.out.printf("Balance: $%.2f%n", acct.getBalance());
        System.out.printf("Monthly interest: $%.2f%n", acct.getMonthlyInterest());
        System.out.println("Date created: " + acct.getDateCreated());
    }
}
