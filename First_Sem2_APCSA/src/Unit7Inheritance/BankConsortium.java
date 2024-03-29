package Unit7Inheritance;

import java.util.ArrayList;

public class BankConsortium {
    public static void main(String[] args) {
        /*
        Unit7Inheritance.BankAccount richGuy = new Unit7Inheritance.BankAccount(1000000);
        Unit7Inheritance.BankAccount lessRichGuy = new Unit7Inheritance.BankAccount();
        System.out.println(richGuy);
        System.out.println(lessRichGuy);

        Unit7Inheritance.SavingsAccount s1 = new Unit7Inheritance.SavingsAccount(300, 0.02);
        System.out.println(s1);
        s1.deposit(5000);
        s1.withdraw(20);
        System.out.println(s1);

        //GOAL: How many times do I have to compound
            //before I have $1,000,000
        int counter = 0;
        while (s1.checkBalance() < 1000000){
            counter++;
            s1.compoundInterest();
        }
        System.out.println(counter);

        Unit7Inheritance.CheckingAccount c1 = new Unit7Inheritance.CheckingAccount(100);
        System.out.println(c1);
        c1.withdraw(200);
        c1.withdraw(200);
        System.out.println(c1);

        //Unit7Inheritance.BankConsortium craziness = new Unit7Inheritance.BankConsortium();

        */


        BankAccount crazy = new SavingsAccount(200, 0.05);
        crazy.withdraw(100);
        System.out.println(crazy.checkBalance());
        //crazy.compoundInterest();
        //When I can do a more specific thing, I do the more specific thing
        System.out.println(crazy.toString());

        ArrayList<BankAccount> banks = new ArrayList<BankAccount>();
        banks.add(new BankAccount());
        banks.add(new CheckingAccount(100));
        banks.add(new SavingsAccount(100, 0.05));
        for (BankAccount b : banks){
            b.deposit(50);
            b.getMeasure();
            b.withdraw(500);
            System.out.println(b);
        }

        Measurable m1 = new BankAccount();
        //very TIGHT jacket
        System.out.println(m1.getMeasure());


    }

    public static double getTotalMeasure(ArrayList<Measurable> things){
        double total = 0;
        for (int i = 0; i < things.size(); i++){
            Measurable item = things.get(i);
            total += item.getMeasure();
        }
        return total;
    }

}









