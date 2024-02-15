import java.util.ArrayList;

public class BankConsortium {
    public static void main(String[] args) {
        /*BankAccount b1 = new BankAccount("Jeff Be$o$", 35000000000.0);
        BankAccount b2 = new BankAccount("Bubba");
        b1.withdraw(100);
        b2.deposit(47);
        System.out.println(b1);
        System.out.println(b2);

        SavingsAccount s1 = new SavingsAccount("Ms Snyder", 50, 0.05);
        //s1.setOwnerName("Ms. Christina Snyder");
        //s1.deposit(50);
        System.out.println(s1);
        //how many times do I compound before I get $1000000
        int count = 0;
        //Loop?
        while (s1.getBalance() < 1000000){
            //compound?
            s1.compoundInterest();
            count++;
        }
        System.out.println(count);

        CheckingAccount c1 = new CheckingAccount("Ursula", 300);
        System.out.println(c1);
        c1.withdraw(600);
        System.out.println(c1);

         */

        BankAccount test1 = new SavingsAccount("A person", 500, 0.05);
        System.out.println(test1.getBalance());
        test1.withdraw(200);
        //test1.compoundInterest();
        //if I can do a more specific thing, I do the more specific thing
        System.out.println(test1.toString());

        BankAccount test2 = new CheckingAccount("A different Person");
        System.out.println(test2);
        test2.withdraw(300);
        System.out.println(test2);

        ArrayList<BankAccount> bank = new ArrayList<BankAccount>();
        bank.add(new BankAccount());
        bank.add(new SavingsAccount("name", 0, 0.03));
        bank.add(new CheckingAccount("name2"));
        for (BankAccount b : bank){
            b.deposit(200);
            System.out.println(b);
        }

        Measurable m1 = new BankAccount();
        //this is a TIGHT jacket
        System.out.println(m1.getMeasure());
        //System.out.println(m1.deposit(2)); the one arm jacket thing
        System.out.println(m1);
    }

    public static double totalMeasure(ArrayList<Measurable> things){
        double total = 0;
        for (int i = 0; i < things.size(); i++){
            Measurable item = things.get(i);
            total += item.getMeasure();
        }
        return total;
    }
}
