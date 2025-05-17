public class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public  void deposit(double amount) {
        if(amount<0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        else{
            this.balance += amount;
            System.out.println(amount + " deposited successfully.");
        }
    }

    public void withdraw(double amount) {
        if(amount==0 || amount<0){
            throw new IllegalArgumentException("Amount cannot be negative and zero");
        } else if (amount>balance) {
            throw new IllegalArgumentException("Amount cannot be greater than balance");
        }
        else{
            this.balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    public void checkBalance(){
        System.out.println("Balance: "+ balance);
    }
}
