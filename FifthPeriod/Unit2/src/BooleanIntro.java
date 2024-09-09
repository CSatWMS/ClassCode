public class BooleanIntro {
    public static void main(String[] args) {
        //boolean = a new data type
        //true / false

        boolean canVote = true;
        boolean isMinor = false;
        System.out.println(canVote);
        System.out.println(isMinor);
        System.out.println("true");

        //relational operators
            /*
                >     Greater than
                <     Less Than
                >=    Greater than or equal to (NOT =>
                <=    Less than or equal to

                ==    Equals Equals (will detect when two primitive types are the same)
                !=    Not Equals (will detect when primitive types are different)

                .equals() -> compare contents of your string, instead of the addresses
                        a.equals(b) (like ==)
                        !a.equals(b)  (like !=)
                !       Not Sign (flips a boolean)

             */
        boolean test1 = 15 > 2; //true
        boolean test2 = 15 > 15; //false
        boolean test3 = 15 <= 15; //true
        boolean test4 = 15 == 15; // true
        boolean test5 = 15 != 9; //true

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
