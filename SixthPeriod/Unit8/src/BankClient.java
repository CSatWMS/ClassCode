public class BankClient {
    public static void main(String[] args) {
        //BankClient wierd = new BankClient();
        BankAccount b1 = new BankAccount("Sally");
        b1.deposit(500);
        b1.withdraw(10.50);
        System.out.println(b1);

        SavingsAccount s1 = new SavingsAccount("Bob", 0.07);
        s1.deposit(300);
        System.out.println(s1);
        System.out.println("Interest Added: " + s1.compoundInterest());
        System.out.println(s1);

        //how many times do I need to compound before Bob has $5000
        int counter = 1;
        while (s1.checkBalance() < 5000){
            s1.compoundInterest();
            counter++;
        }
        System.out.println("With a balance of $" + String.format("%.2f", s1.checkBalance()) + " Bob compounded " + counter + " times");

        CheckingAccount c1 = new CheckingAccount("Louise");
        c1.deposit(100);
        c1.deposit(100);
        c1.deposit(100);
        c1.deposit(100);
        c1.deposit(100);
        c1.deposit(100);
        System.out.println(c1);
        c1.withdraw(500);
        System.out.println(c1);
        c1.withdraw(500);

        BankAccount a = new BankAccount("A");
        BankAccount b = new BankAccount("B");
        a.deposit(250);
        a.transferFunds(b, 50);
        System.out.println(a);
        System.out.println(b);

        SavingsAccount c = new SavingsAccount("C", 0.05);
        a.transferFunds(c, 50);
        System.out.println(a);
        System.out.println(c);

        BankAccount d = new SavingsAccount("D", 0.5);
        d.deposit(1000);
        //d.compoundInterest(); compile time error -> one armed jacket rule
        System.out.println(d); //when I can do a more specific thing, I do the more specific thing

        ( (SavingsAccount) d).compoundInterest(); //temporary casts ARE DANGEROUS
        System.out.println(d);

        //( (CheckingAccount) d).deposit(20); //BE CAREFUL!

        //instanceof -> sees through jackets
        System.out.println("D is a BankAccount: " + (d instanceof BankAccount));
        System.out.println("D is a SavingsAccount: " + (d instanceof SavingsAccount));
        System.out.println("D is a CheckingAccount: " + (d instanceof CheckingAccount));


    }
}
