public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    /*
    public BankAccount(){
        balance = 0;
    }
    parameterless constructor helps super() calls out
     */

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
        return String.format("The balance is: $%.2f", balance);
    }


}
