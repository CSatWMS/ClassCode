import java.util.ArrayList;
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
        System.out.println(findMin(nums));

        ArrayList<String> teams = new ArrayList<String>();
        teams.add("GA Bulldogs");
        teams.add("Jackets");
        teams.add("Jackets");
        teams.add("The Eagles");
        teams.add("Falcons");
        teams.add("Stripers");
        fancyPrint(teams);
        System.out.println(teams);
        teams = deleteJackets(teams);
        System.out.println(teams);
    }

    public static ArrayList<String> deleteJackets(ArrayList<String> list){
        //.remove(index)
       /* for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals("Jackets")){
                list.remove(i);
                i--;
            }
        }
        */
        /*for (int i = list.size() - 1; i >= 0; i--){
            if (list.get(i).equals("Jackets")) {
                list.remove(i);
            }
        }*/

        int i = 0;
        while (i < list.size()){
            if (list.get(i).equals("Jackets")) {
                list.remove(i);
            } else {
                i++;
            }
        }
        return list;
    }

    public static void fancyPrint(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.get(i).length(); j++){
                System.out.print(list.get(i).charAt(j) + " ");
            }
            System.out.println();
        }

    }

    public static double findMin(ArrayList<Double> list){
        //init
        double smallest = list.get(0);
        //loop
        for (double curr : list) {
            //check for bigger/smaller
            if (curr < smallest){
                //update
                smallest = curr;
            }

        }
        return smallest;
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
