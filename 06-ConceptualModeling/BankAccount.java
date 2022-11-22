public class BankAccount {
    private String owner;
    private String accountNumber;
    private double accountBalance;

    public String getOwner() {
        return this.owner;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public BankAccount(String owner, String accountNumber, double accountBalance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        this.accountBalance+=amount;
    }

    public void withdraw(double amount) {
        if (this.accountBalance < amount) {
            System.out.println("Not enough money.");
        } else if (amount > 500) {
            System.out.println("You cannot withdraw more than 500PLN.");
        } else {
            this.accountBalance -= amount;
        }
    }

    public void displayBalance() {
        System.out.println("Your account balance is: " + getAccountBalance() + "PLN");
    }


    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Amelia", "1234-5678", 0);

        b1.deposit(500);
        b1.displayBalance();
        b1.deposit(200);
        b1.displayBalance();
        b1.withdraw(300);
        b1.displayBalance();
        b1.withdraw(501);
        b1.displayBalance();
    }

}