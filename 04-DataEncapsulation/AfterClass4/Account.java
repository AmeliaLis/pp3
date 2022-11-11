public class Account {
    public String name;
    public String surname;
    private String accountNumber;
    private double accountBalance;
    

    public void SetAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void SetAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String GetName() {
        return this.name;
    }

    public String GetSurname() {
        return this.surname;
    }

    private double GetBalance() {
        return this.accountBalance;
    }

    private String GetAccountNumber() {
        return this.accountNumber;
    }

    public void DisplayInformation(){
        System.out.println(this.name + " " + this.surname + " " + GetBalance() + " " + GetAccountNumber());
    }

    public static void main(String[] args) {
        Account acc1 = new Account();

        acc1.name = "Jake";
        acc1.surname = "Hiddlestone";
        acc1.SetAccountBalance(289145.78);
        acc1.SetAccountNumber("2341-9072-4672-2894-1923");

        acc1.DisplayInformation();
    }
}
