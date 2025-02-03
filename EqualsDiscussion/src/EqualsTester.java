import java.util.ArrayList;

public class EqualsTester {
    public static void main(String[] args) {
        WazDoodle one = new WazDoodle("Hello");
        WazDoodle two = new WazDoodle("Hello");
        System.out.println(one == two);
        System.out.println(one.equals(two));
        System.out.println(one.getZ().equals(two.getZ()));

        ArrayList<WazDoodle> list = new ArrayList<WazDoodle>();
        list.add(one);
        list.add(two);
        System.out.println(list);
        list.remove(new WazDoodle("Hello"));
        System.out.println(list);
        list.remove(one);
        System.out.println(list);
    }
}
