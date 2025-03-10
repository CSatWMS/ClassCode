public class SavingsAccount extends BankAccount{
    private double interestRate;
    private int withdrawCounter;

    public static final int MAX_WD = 5;

    public SavingsAccount(double interestRate){
        //super(); //implied call to super -> IT ALWAYS HAPPENS

        super(0); //the call to super() always happens first
        this.interestRate = interestRate;
        withdrawCounter = 0;
    }

    public String toString(){
        String toReturn = super.toString();
        toReturn += "\nInterest Rate: " + interestRate;
        toReturn += ", Withdrawals Remaining: " + (MAX_WD - withdrawCounter);
        return toReturn;
    }

    public void withdraw(double amt){
        withdrawCounter++;
        if (withdrawCounter > MAX_WD){
            System.out.println("ERROR: MAX Withdrawal Limit Met");
        } else {
            super.withdraw(amt);
        }
    }

    public void compoundInterest(){
        double interestAmount = checkBalance() * interestRate;
        deposit(interestAmount);
    }

}
