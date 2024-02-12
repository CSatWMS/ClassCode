public class BankConsortium {
    public static void main(String[] args) {
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












        /*
        BankConsortium crazy = new BankConsortium();
        System.out.println(crazy);
         */
    }
}
