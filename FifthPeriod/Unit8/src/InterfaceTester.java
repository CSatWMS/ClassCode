import javax.swing.plaf.IconUIResource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class InterfaceTester {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        //populate that with clients
        sort(accounts);

        //ArrayList<Country> countries = new ArrayList<Country>();
        //sort(countries);

        BankAccount b = new BankAccount(500);
        Measurable m = new BankAccount(500);
        System.out.println(m.getMeasure());
        ( (BankAccount) m).deposit(100);

        ArrayList<Measurable> things = new ArrayList<Measurable>();
        things.add(new BankAccount(100));
        things.add(new BankAccount(200));
        things.add(new BankAccount(300));
        things.add(new BankAccount(400));
        System.out.println(getAverageMeasure(things));

        ArrayList<Measurable> countries = new ArrayList<Measurable>();
        countries.add(new Country("USA", 2000));
        countries.add(new Country("Colombia", 5000));
        countries.add(new Country("Canada", 3000));
        System.out.println(getAverageMeasure(countries));
    }

    public static int getAverageMeasure(ArrayList<Measurable> things){
        int sum = 0;
        for (Measurable m : things){
            sum += m.getMeasure();
        }
        return sum / things.size();
    }

    /*public static void sort(ArrayList<Comparable> things){
        //do the sorting
    }*/

    public static void sort(ArrayList<BankAccount> accounts){
        //do the sorting
    }
/*
    public static void sort(ArrayList<Country> accounts){
        //do the sorting
    }

 */

}
