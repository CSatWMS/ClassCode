public class BankAccount {
    private String bank, owner;
    private double balance;

    public BankAccount(String owner, String bank){
        this.owner = owner;
        this.bank = bank;
        balance = 0;
    }

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
        //owner at bank has $money
        return String.format("%s at %s has $%.2f", owner, bank, balance);
    }


    public void transferFunds(BankAccount other, double money){
        this.balance -= money;
        other.deposit(money); //other.balance += money;
    }

}
