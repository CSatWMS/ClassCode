package Unit6ArrayList;

import java.util.Arrays;

public class TheBasics {
    public static void main(String[] puppies) {
        //dataType varName = value;
        int myFavNum = 11;
        makeSentence(myFavNum);
        boolean result = isEven(myFavNum);
        System.out.println(result);

        //dt arrName[] = {val1, val2, val3, etc};
            //dt[] arrName = new dt[size];

        int[] numbers = {11, 62, 57, 23, 94};

        //for (initialization ; condition ; update)
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        makeSentence(numbers);

    } // ends my main method

    //GOAL: overload the makeSentence
        //it should now take in an array of numbers
        //it should make sentences about each number
    public static void makeSentence(int[] numbers){
        for (int num : numbers){
            makeSentence(num);
        }
    }

    //GOAL: print a sentence about your favorite number
    public static void makeSentence(int number){
        System.out.print("My favorite number is " + number);
        if (isEven(number)){
            System.out.println(" and it's even!");
        } else {
            System.out.println(" and it's odd!");
        }
    }

    //GOAL: Write a function that returns a boolean
        //call it: isEven
            //return true -> if my number is even
            //return false -> if my number is odd
    public static boolean isEven(int number){
        if (number % 2 == 0) {
            return true;
        } else
            return false;

    }


} //ends the class
