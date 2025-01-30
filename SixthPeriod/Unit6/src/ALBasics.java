import java.lang.reflect.Array;
import java.util.ArrayList;

public class ALBasics {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<Double>();
        System.out.println(nums);
        System.out.println(nums.size());
        nums.add(3.14);
        nums.add(6.02);
        System.out.println(nums);
        nums.add(0, 6.28);
        System.out.println(nums);
        System.out.println(sumUp(nums));
        System.out.println(locateMinMax(nums));

        ArrayList<String> foods = new ArrayList<String>();
        foods.add("Pizza");
        foods.add("Empanadas");
        foods.add("Tuna");
        foods.add("Tuna");
        foods.add("Ice Cream");
        foods.add("Firecracker Chicken");
        fancyPrint(foods);
        System.out.println(foods);
        System.out.println(removeTuna(foods));

        int[] arr = {10, 11, 12, 10, 11, 12, 10, 11, 12};
        System.out.println(locateAll(arr, 10));
    }

    //locateAll
        //return an AL of all the indexes of a target number
    public static ArrayList<Integer> locateAll(int[] vals, int target){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < vals.length; i++){
            if (vals[i] == target){
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static ArrayList<String> removeTuna(ArrayList<String> list){
        /*for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals("Tuna")){
                list.remove(i);
                i--;
            }
        }*/
        for (int i = list.size() - 1; i >= 0; i--){
            if (list.get(i).equals("Tuna")) {
                list.remove(i);
            }
        }
        return list;
    }

    //fancyPrint
        //P i z z a
        //E m p a n a d a s
        //...
    public static void fancyPrint(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.get(i).length(); j++){
                System.out.print(list.get(i).charAt(j) + " ");
            }
            System.out.println();
        }
    }

    //locateMinMax
    public static ArrayList<Double> locateMinMax(ArrayList<Double> list){
        //init
        double min = list.get(0);
        double max = list.get(0);
        //loop
        for (double num : list) {
            //check if bigger/smaller
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
            //update
        }
        //return values
        ArrayList<Double> toReturn = new ArrayList<Double>();
        toReturn.add(min);
        toReturn.add(max);
        return toReturn;
    }

    public static double sumUp(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++){
            double currValue = list.get(i);
            sum += currValue;
        }
        return sum;
    }
}

