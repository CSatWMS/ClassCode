package Unit6;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<Double>();
        System.out.println(scores);
        //miniGOAL: populate my array with 10 random numbers between 0 and 100
        for (int i = 0; i < 10; i++){
            scores.add(Math.random() * 100);
        }
        System.out.println(scores);
        //miniGOAL#2: access the last element
        double lastVal = scores.get(scores.size() - 1);
        System.out.println(lastVal);
        System.out.println(calcAvg(scores));
    }

    //GOAL: return an arraylist
        //that arraylist should contain your min and max values
            //in the list
    public static ArrayList<Double> findMinMax(ArrayList<Double> list){
        //find min:
            //init min
            //loop
                //if statement
                    //update
        //make an arraylist
        //add min and max
        //return the arrayList
        return new ArrayList<>();
    }

    //GOAL: calculate an average value for your arrayList
    public static double calcAvg(ArrayList<Double> list){
        double basket = 0;
        /*for (int i = 0; i < list.size(); i++){
            basket += list.get(i);
        }*/
        for (double num : list){
            basket += num;
        }
        return basket/list.size();
    }

}
