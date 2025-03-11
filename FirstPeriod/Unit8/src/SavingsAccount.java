public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String owner, String bank, double interestRate){
        super(owner, bank);
        //super.balance = 200; balance is private to BankAccount
        deposit(200);
        this.interestRate = interestRate;
    }

    //compound interest returns the gained interest
        //balance * interestRate
        //add it to balance
    public double compoundInterest(){
        double interestAmount = checkBalance() * interestRate;
        //balance += interestAmount;
        deposit(interestAmount);
        return interestAmount;
    }

    public String toString(){
        String parentString = super.toString();
        parentString += ", with a " + interestRate + " rate of interest";
        return parentString;
    }



}
