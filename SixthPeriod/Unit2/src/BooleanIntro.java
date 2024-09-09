

public class BooleanIntro {
    public static void main(String[] args) {
        //boolean
            // can be true / false

        boolean isMinor = false;
        boolean canVote = true;
        System.out.println(isMinor);
        System.out.println(canVote);
        System.out.println("true");

        //relational operators
        /*
            >   greater than
            <   less than
            >=  greater than or equal to
            <=  less than or equal to

            primitive type comparisons
            ==  equals equals (will determine if two things are the same)
            !=  not equals (will determine if things are different)

            reference type comparisons
            .equals() -> compare the contents of MEMORY
                a.equals(b)
                !a.equals(b)

            !   is NOT (flips a boolean)
         */

        boolean test1 = 15 > 9; //true
        boolean test2 = 9 > 9; //false
        boolean test3 = 9 <= 9; //true
        boolean test4 = 9 == 9; // true
        boolean test5 = 9 == 15; // false
        boolean test6 = 9 != 15; // true

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
