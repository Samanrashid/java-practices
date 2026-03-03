class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankOperation {
    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount();

        bank1.accountNumber = 101;
        bank1.holderName = "Saman";
        bank1.balance = 1000;

        bank1.deposit(2000);
        bank1.withdraw(1000);
        bank1.withdraw(100000);

        bank1.showBalance();
    }
}