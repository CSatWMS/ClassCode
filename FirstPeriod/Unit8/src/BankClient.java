public class BankClient {
    public static void main(String[] args) {
        //BankClient weird = new BankClient();
        BankAccount b1 = new BankAccount("Billy", "BOA");
        b1.deposit(500);
        b1.withdraw(200);
        System.out.println(b1);

        SavingsAccount s1 = new SavingsAccount("Sally", "Chase", 0.08);
        s1.deposit(100);
        s1.withdraw(50);
        System.out.println(s1);
        System.out.println("Interest amount: " + s1.compoundInterest());
        System.out.println(s1);

        //how many times does sally need to compound before she has $1000
        int counter = 1;
        while (s1.checkBalance() < 1000){
            counter++;
            s1.compoundInterest();
        }
        System.out.println("to get to $" + String.format("%.2f", s1.checkBalance()) + " we compounded " + counter + " times");


        CheckingAccount c1 = new CheckingAccount("Kevin", "Truist");
        c1.deposit(9999);
        System.out.println(c1);
        c1.deposit(10000);
        System.out.println(c1);
        c1.withdraw(10000);
        System.out.println(c1);

        BankAccount a = new BankAccount("A", "Bank A");
        BankAccount b = new BankAccount("B", "Bank B");
        a.deposit(200);
        a.transferFunds(b, 50);
        System.out.println(a);
        System.out.println(b);

        SavingsAccount c = new SavingsAccount("C", "Bank C", 0.05);
        a.transferFunds(c, 50);
        System.out.println(a);
        System.out.println(c);

        BankAccount d = new SavingsAccount("D", "Bank D", 0.07);
        d.deposit(500);
        //d.compoundInterest(); //compile-time error
        System.out.println(d); //When I can do a more specific thing, I do the more specific thing (overriden methods)

        ( (SavingsAccount) d).compoundInterest(); //DANGEROUS
       // ( (CheckingAccount) d).deposit(20); //BE CAREFUL- RTE- ClassCastException

        //how can we cast safely?
        // instanceof
        System.out.println("is D A bankAccount?: " + (d instanceof BankAccount));
        System.out.println("is D A SavingsAccount?: " + (d instanceof SavingsAccount));
        System.out.println("is D A CheckingAccount?: " + (d instanceof CheckingAccount));

        if (d instanceof CheckingAccount){
            ((CheckingAccount) d).deposit(20);
        } else {
            System.out.println("WRONG DATATYPE");
        }
    }
}
