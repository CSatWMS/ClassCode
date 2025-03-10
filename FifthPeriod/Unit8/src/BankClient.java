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
    }
}
