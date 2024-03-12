package Unit7;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String ownerName, double balance, double interestRate){
        //this.ownerName = ownerName; //has private access in Unit7.BankAccount
        //this.interestRate = interestRate; //CANNOT HAPPEN before super
        super(ownerName, balance); //super MUST be the first thing in a subclass constructor
        this.interestRate = interestRate;
    }

    //GOAL: compound interest
        //multiply balance * interestRate
        //add that to my balance
        //lets return the amount of interest added
    public double compoundInterest(){
        double interestAmount = getBalance() * interestRate;
        deposit(interestAmount);
        return interestAmount;
    }

    public String toString(){
        String toReturn = super.toString();
        toReturn += ", with an interest Rate of " + (interestRate * 100) + "%";
        return toReturn;
    }


}
