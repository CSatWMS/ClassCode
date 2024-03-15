package Unit7Inheritance;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate){
       // super.balance = initialBalance; //BAD-> Private access in Unit7Inheritance.BankAccount
       // this.interestRate = interestRate; //BAD -> call to super must be FIRST
        super(initialBalance); //invokes Unit7Inheritance.BankAccount's constructor
        this.interestRate = interestRate;
    }

    //GOAL: Compound Interest
        //1. Calculate Interest (balance * interestRate)
        //2. Add that interest to the balance
        //3. Return the interest amount
    public double compoundInterest(){
        //checkBalance() vs this.checkBalance() vs super.checkBalance()
            //all the same bc nothing is overridden
        double interestAmount = checkBalance() * interestRate;
        //checkBalance() = checkBalance() + interestAmount; //BAD -> cause getter
        deposit(interestAmount);
        return interestAmount;
    }

    public String toString(){
        String fromParent = super.toString();
        String toReturn = fromParent + ", with an interest of " + (interestRate*100) + "%";
        return toReturn;
    }


}
