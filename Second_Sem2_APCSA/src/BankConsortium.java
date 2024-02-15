import java.util.ArrayList;

public class BankConsortium {
    public static void main(String[] args) {
        /*
        BankAccount b1 = new BankAccount("Jeff Be$o$", 1000000000);
        BankAccount b2 = new BankAccount("Bubba", 27);
        b1.withdraw(100);
        b2.deposit(250);
        System.out.println(b1);
        System.out.println(b2);

        SavingsAccount s1 = new SavingsAccount("Christina Snyder", 10, 0.05);
        s1.deposit(200);
        s1.withdraw(20);
        System.out.println(s1);

        //How many times do I need to compound
        //before I have $1,000,000


        int counter = 0;
        while (s1.checkBalance() < 1000000){
            s1.compoundInterest();
            counter++;
        }
        System.out.println(counter);

        CheckingAccount c1 = new CheckingAccount("Bob", 100);
        System.out.println(c1);
        c1.withdraw(200);
        System.out.println(c1);
        c1.withdraw(200);
        System.out.println(c1);

        */

        BankAccount crazy = new SavingsAccount("Somebody", 100, 0.02);
        crazy.deposit(100);
        crazy.withdraw(20);
        //crazy.compoundInterest();
        //when I can do a more specific thing, I do the more specific thing
        System.out.println(crazy.toString());

        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount());
        accounts.add(new SavingsAccount("Another dude", 50, .10));
        accounts.add(new CheckingAccount("third person"));

        for (BankAccount b : accounts){
             b.deposit(300);
            b.withdraw(1000);
            System.out.println(b);
        }


        Measurable m1 = new BankAccount();
        //a very TIGHT jacket
        System.out.println(m1.getMeasure());






        /*
        BankConsortium crazy = new BankConsortium();
        System.out.println(crazy);
         */
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
