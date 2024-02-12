public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    //Default Constructor
    public BankAccount(){
        this(0);
    }

    //deposit, withdraw, checkBalance

    public void deposit(double amt){
        balance += amt;
    }

    public void withdraw(double amt){
        balance -= amt;
    }

    public double checkBalance(){
        return balance;
    }

    public String toString(){
        return "$" + balance;
    }


}
