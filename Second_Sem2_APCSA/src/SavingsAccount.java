public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String ownerName, double initialBalance, double interestRate){
        //super.ownerName = ownerName; //MAD -> bc private to BankAccount
        //this.interestRate = interestRate; //Makes super MAD bc he has to be first
        super(ownerName, initialBalance); //invokes the super class constructor
        this.interestRate = interestRate;
    }

    //GOAL: Compound Interest
        //1. calculate amount of interest (interestRate * balance)
        //2. add the interest amount to your balance
        //3. return the amount of interest
    public double compoundInterest(){
            //super.checkBalance() vs this.checkBalance() vs checkBalance()
                //all three ways are correct and the same
                    //because i HAVE NOT overriden the behavior
        double interestAmt = interestRate * super.checkBalance();
        //checkBalance() = checkBalance() + interestAmt; BAD IDEA -> CheckBalance is ONE WAY
        deposit(interestAmt);
        return interestAmt;
    }

    public String toString(){
        String fromParent = super.toString();
        String toReturn = fromParent + ", with a " + (interestRate * 100) + "% interest rate";
        return toReturn;
    }


}
