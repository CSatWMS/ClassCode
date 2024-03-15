package Unit7Inheritance;

public class CheckingAccount extends BankAccount {
    //no instance variables

    public CheckingAccount(double initialBalance){
        super(initialBalance + 200);
    }

    public void withdraw(double amt){
        if (amt <= checkBalance()){
            //I'm good to go
            super.withdraw(amt);
        } else {
            System.out.println("You Broke...");
        }
    }

    public String toString(){
        return super.toString() + " in a checking account!";
    }
}
