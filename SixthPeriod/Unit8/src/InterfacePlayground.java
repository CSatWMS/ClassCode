import java.lang.reflect.Array;
import java.util.ArrayList;

public class InterfacePlayground {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Dude");
        System.out.println(b);
        b.deposit(200);
        System.out.println(b.getMeasure());

        Measurable m = new BankAccount("Dudette");
        System.out.println(m.getMeasure());
        //m.deposit(200);

        ArrayList<Measurable> items = new ArrayList<Measurable>();
        items.add(new BankAccount("A"));
        items.add(new BankAccount("B"));
        items.add(new BankAccount("C"));
        items.add(new BankAccount("D"));

        //ArrayList<ZooAnimal> zoo = new ...
        //ArrayList<Country> countries = new ...


    }

    public static int getAverageMeasure(ArrayList<Measurable> things){
        int sum = 0;
        for (Measurable m : things){
           sum += m.getMeasure();
        }
        return sum / things.size();
    }
    /*
    public static void sort(ArrayList<BankAccount> accounts){
        //do the sorting
    }
     */

    public static void sort(ArrayList<Comparable> things){
        //sort with compareTo()
    }
}
