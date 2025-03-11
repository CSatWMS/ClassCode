public class CheckingAccount extends BankAccount {
    private int depositCounter;

    public static final int MAX_DEPOSITS = 5;

    public CheckingAccount(String owner){
        //super(); implied call to super
        //depositCounter = 0; calls to super MUST happen first
        super(owner);
        depositCounter = 0;
    }

    //overriding the deposit behavior -> the exact same method signature
        //different from overloading -> same method, different parameters
    public void deposit(double amt){
        if (depositCounter < MAX_DEPOSITS){
            super.deposit(amt);
            depositCounter++;
        } else {
            System.out.println("ERROR: Max Deposits Met");
        }
    }

    //overdraft protection
    public void withdraw(double amt){
        if (amt > checkBalance()){
            System.out.println("ERROR: Insufficient Funds");
        } else {
            super.withdraw(amt);
        }
    }
}
