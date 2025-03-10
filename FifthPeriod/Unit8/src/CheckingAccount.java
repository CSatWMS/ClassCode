public class CheckingAccount extends BankAccount {

    public CheckingAccount(){
        //balance = 200;
        super(200);
    }

    public CheckingAccount(double initialBalance){
        //super(200 + initialBalance);
        super(initialBalance);
        deposit(200);
    }

    //changing an inherited behavior = overriding -> exact same method signature
        //this is different from overLOADING -> different parameters, same name + return type
    public void withdraw(double amt){
        //overdraft protection
            //we dont want to go below zero

        //chekc if the amt > balance
            //ERROR
        //if we're good
            //then we withdraw
        if (amt > checkBalance()){
            System.out.println("ERROR: Not enough funds");
        } else {
            super.withdraw(amt);
        }
    }
}
