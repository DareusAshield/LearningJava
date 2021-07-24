public class BankAccount {
    private String account;
    private double balance;

    BankAccount(String account, int startingBalance) {
        this.account = account;
        this.balance = Math.max(startingBalance, 0);
    }

    public String getAccount() {

        return account;
    }

    public double getBalance() {

        return balance;
    }

    public double withdraw(double amt) {
        if (amt >= this.balance) {
            this.balance = this.balance - amt;
            return amt;
        }
        return 0;


    }

    public double deposit(double amt) {
        if (amt > 0) {
            this.balance = this.balance + amt;
            return amt;
        }
        return 0;
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Dareus", 1000000);
        bankAccount.withdraw(500);
        bankAccount.deposit(400);
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getAccount());
    }
}

