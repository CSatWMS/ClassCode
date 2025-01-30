import java.util.ArrayList;
import java.util.Arrays;

public class ALIntro {
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
        System.out.println(Arrays.toString(findMinMax(nums)));

        ArrayList<String> cartoons = new ArrayList<String>();
        cartoons.add("Spongebob");
        cartoons.add("Patrick");
        cartoons.add("Patrick");
        cartoons.add("Barbie");
        cartoons.add("Tom");
        cartoons.add("Jerry");
        fancyPrint(cartoons);
        System.out.println(cartoons);
        System.out.println(removePatricks(cartoons));

        int[] numbers = {10, 11, 12, 10, 11, 12, 10, 11, 12};
        System.out.println(locateAll(numbers, 10));



        int[] x = {1, 2, 3};
        int y = 7;
        int z = craziness(x, y);

        //print all the values, what would they say?
        //a -> Error, DNE
        //b -> Error, DNE
        //x -> {104, 2, 3}
        //y -> 7
        //z -> 10
    }

    public static int craziness(int[] a, int b){
        b = 10;
        a[0] = 104;
        return b;
    }



    //locateAll
    public static ArrayList<Integer> locateAll(int[] nums, int target){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static ArrayList<String> removePatricks(ArrayList<String> list){
        /*for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals("Patrick")){
                list.remove(i);
                i--;
            }
        }*/
        for (int i = list.size() - 1; i >= 0; i--){
            if (list.get(i).equals("Patrick")) {
                list.remove(i);
            }
        }
        return list;
    }

    //S p o n g e b o b
    //

    public static void fancyPrint(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.get(i).length(); j++){
                System.out.print(list.get(i).charAt(j) + " ");
            }
            System.out.println();
        }
    }

    public static double[] findMinMax(ArrayList<Double> list){
        double min = list.get(0);
        double max = list.get(0);
        for (double num : list){
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
        }
        return new double[]{min, max};
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
