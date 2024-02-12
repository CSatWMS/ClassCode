public class BankAccount {
    private double balance;
    private String ownerName;

    public BankAccount(String ownerName, double balance){
        this.balance = balance;
        this.ownerName = ownerName;
    }

    //default constructor (no parameters)
    public BankAccount(){
        this("Unknown", 0);
            //the this() invokes the previous constructor
                //feed it params, then initializes instance vars
    }

    //deposit(amt) | withdraw(amt) | checkBalance()
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
        return ownerName + " has $" + balance;
    }


}
