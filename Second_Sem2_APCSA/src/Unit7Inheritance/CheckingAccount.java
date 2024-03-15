package Unit7Inheritance;

public class CheckingAccount extends BankAccount {
    public static int overDraftFee = 37;

    public CheckingAccount(String owner, double initialBalance){
        super(owner, initialBalance + 200);
    }

    public CheckingAccount(String owner){
        super(owner, 200);
    }

    public void withdraw(double amt){
        super.withdraw(amt);
        if (checkBalance() < 0){
            super.withdraw(overDraftFee);
            System.out.println("OVERDRAFT FEE CHARGED");
        }
    }

    public String toString(){
        return super.toString() + " in a checking account!";
    }
}
