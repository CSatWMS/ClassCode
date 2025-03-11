public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String ownerName, double interestRate){
        super(ownerName);
        this.interestRate = interestRate;
        //balance = 200; private to BankAccount
        deposit(200);
    }

    //compoundInterest
        //multiply intRate * balance
        //add that result to the balance
    public double compoundInterest(){
        double interestAmount = interestRate * checkBalance();
        deposit(interestAmount);
        return interestAmount;
    }

    public String toString(){
        String parentString = super.toString();
        parentString += ", with a " + interestRate + " rate of interest";
        return parentString;
    }
}
