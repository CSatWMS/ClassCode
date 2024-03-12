package Unit7;

public class CheckingAccount extends BankAccount {
    public static double overDraftFee = 75.00;

    public CheckingAccount(String ownerName, double initialBalance){
        super(ownerName, initialBalance + 200);
    }

    public CheckingAccount(String ownerName){
        super(ownerName, 200);
    }

    public void withdraw(double amt){
        super.withdraw(amt); //here SUPER is not optional
        if (getBalance() < 0){ //super is optional, bc we haven't overridden it
           super.withdraw(overDraftFee);
        }
    }

    public String toString(){
        return super.toString() + " in a checking account!";
    }

}
