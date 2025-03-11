public class CheckingAccount extends BankAccount{
    public static final double OVERDRAFT_PENALTY_PERCENT = 0.5;
    public static final int MAX_DEPOSIT_AMT = 10000;

    public CheckingAccount(String owner, String bank){
        //super(); implied call to super always happens first
        super(owner, bank);
    }

    //overriding behavior -> Exact same method signature
        //different from overloading -> same method, different parameters
    public void deposit(double amt){
        if (amt < MAX_DEPOSIT_AMT){
            super.deposit(amt);
        } else {
            System.out.println("ERROR: TOO MUCH MONEY");
        }
    }

    //implementing overdraft penalties
    public void withdraw(double amt){
        super.withdraw(amt);
        if (checkBalance() < 0){
            super.withdraw(amt * OVERDRAFT_PENALTY_PERCENT);
        }
    }
}
