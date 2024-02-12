package Unit6ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Double> highScores = new ArrayList<Double>();
        System.out.println(highScores);
        //minigoal: populate the list with 10 random percentages
        for (int i = 0; i < 10; i++){
            highScores.add((double) Math.round(Math.random()*100 *100) / 100 );
        }
        System.out.println(highScores);
        double lastHighScore = highScores.get(highScores.size() - 1);
        System.out.println(lastHighScore);
        System.out.println(calcAvg(highScores));
    }

    //GOAL: Return an arrayList containing the min and max of your list
    public static ArrayList<Double> findMinMax(ArrayList<Double> numbers){
        //find min/max
                /*
                reminder:
                init
                loop
                    if statement
                        update
                 */
        //create the array list to return
        //add to that arraylist
        //return it
        return new ArrayList<>();
    }

    //GOAL: to calculate the average highScore
    public static double calcAvg(ArrayList<Double> list){
        double total = 0;
        /* (int i =0 ; i < list.size(); i++){
            total += list.get(i);
        }*/
        for (double x : list){
            total += x;
        }
        return total / list.size();
    }
}
