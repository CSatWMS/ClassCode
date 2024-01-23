import java.util.Arrays;

public class TheBasics {
    public static void main(String[] puppies) {
        //dataType varName = value;
        int myFavNumber = 11;
        makeSentence(myFavNumber);
        boolean result = isEven(myFavNumber);
        System.out.println(result);

        //dt[] arrName = {val1, val2, etc};
            //dt[] arrName = new dt[size];

        int[] numbers = {11, 17, 62, 54, 23};

        //for (initialization ; condition(s) ; update)
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
            //makeSentence(numbers[i]);
        }
        System.out.println();
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        makeSentence(numbers);

    } //ends my main method

    //GOAL: Overload makeSentence to create sentence about an array of numbers
    public static void makeSentence(int[] numbers){
        for (int num : numbers){
            makeSentence(num);
        }
    }

    //GOAL: print out a sentence about your fav number
    public static void makeSentence(int number){
        System.out.print("My favorite number is " + number);
        if (isEven(number)){
            System.out.println(" and it's even!");
        } else {
            System.out.println(" and it's odd!");
        }
    }

    //GOAL: a method, isEven, take in a number, and return a boolean
        //true -> if that number is even
        //false -> if that number is odd
    public static boolean isEven(int number){
        if (number % 2 == 0) {
            return true;
        } else
            return false;
    }

} //ends the class
