public class BankAccount {
    //instance variables
    private double balance;
    private String owner;

    //constructor
    public BankAccount(String owner){
        this.owner = owner;
        balance = 0;
    }

    //instance methods
    public void deposit(double amt){
        balance += amt;
    }

    public void withdraw(double amt){
        balance -= amt;
    }

    public double checkBalance(){
        return balance;
    }

    public String getOwner(){
        return owner;
    }

    public String toString(){
        return String.format("%s has $%.2f", owner, balance);
    }

    public void transferFunds(BankAccount other, double money){
        this.balance -= money;
        other.deposit(money); // other.balance += money;
    }
}
