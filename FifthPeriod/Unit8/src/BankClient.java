public class BankClient {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(500);
        b1.withdraw(300);
        b1.deposit(100);
        System.out.println(b1);

        CheckingAccount c1 = new CheckingAccount();
        c1.withdraw(200);
        c1.withdraw(200);
        System.out.println(c1);

        SavingsAccount s1 = new SavingsAccount(0.05);
        System.out.println("---Deposit $100---");
        s1.deposit(100);
        System.out.println(s1);
        System.out.println("---Withdraw $5 6 times---");
        s1.withdraw(5);
        System.out.println(s1);
        s1.withdraw(5);
        System.out.println(s1);
        s1.withdraw(5);
        System.out.println(s1);
        s1.withdraw(5);
        System.out.println(s1);
        s1.withdraw(5);
        System.out.println(s1);
        s1.withdraw(5);
        System.out.println(s1);
        System.out.println("---Compound Interest twice---");
        s1.compoundInterest();
        System.out.println(s1);
        s1.compoundInterest();
        System.out.println(s1);

        BankAccount a = new BankAccount(100);
        BankAccount b = new BankAccount(100);
        a.transferFunds(b, 50);
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        SavingsAccount c = new SavingsAccount(.05);
        a.transferFunds(c, 25);
        System.out.println("A: " + a);
        System.out.println("C: " + c);

        BankAccount z = new SavingsAccount(0.05);
        System.out.println("Z: " + z);
        z.deposit(500);
        //z.compoundInterest(); restrictive jacket prevents compounding
        ( (SavingsAccount) z ).compoundInterest(); //DANGER

        BankAccount y = new CheckingAccount();
       // ( (SavingsAccount) y).compoundInterest(); //BE CAREFUL -> RTE ClassCastException

        //instanceof
        System.out.println("Z is BankAccount: " + (z instanceof BankAccount));
        System.out.println("Z is SavingsAccount: " + (z instanceof SavingsAccount));
        System.out.println("Z is CheckingAccount: " + (z instanceof CheckingAccount));

        if (y instanceof SavingsAccount){
            ( (SavingsAccount) y).compoundInterest();
        } else {
            System.out.println("NOT A SAVINGS ACCOUNT");
        }
    }
}
