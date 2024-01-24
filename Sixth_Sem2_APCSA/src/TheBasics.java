import java.util.Arrays;

public class TheBasics {
    public static void main(String[] puppies) {
        //dataType varName = value;
        int myFavNum = 1;
        makeSentence(myFavNum);
        boolean result = isEven(myFavNum);
        System.out.println(result);

        //dt arrName[] = {val1, val2, etc};
            //dt[] arrNam2 = new dt[size];

        int[] numbers = {11, 62, 57, 93, 17};

        //for (initialization ; condition ; update)
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        makeSentence(numbers);

    } //ends the main method

    //GOAL: overload the makeSentence, and now take in an array of numbers
        //make sentences about each of them
    public static void makeSentence(int[] numbers){
        for (int num : numbers){
            makeSentence(num);
        }
    }

    //GOAL: print a sentence about a number
    public static void makeSentence(int number){
        System.out.print("My favorite number is " + number);
        if (isEven(number)){
            System.out.println(" and it's even!");
        } else {
            System.out.println(" and it's odd!");
        }
    }

    //GOAL: determine if a number is even or not
        //call it: isEven, take in a number
        //return true -> if it's even
        //return false -> if it's odd
    public static boolean isEven(int number){
        if (number % 2 == 0) {
            return true;
        } else
            return false;

    }


} //ends the class
