package Unit2;

public class SwitchIntro {
    public static void main(String[] args) {
        String dayOfTheWeek = "Monday";
        if (dayOfTheWeek.equals("Sunday")){
            System.out.println(1);
        } else if (dayOfTheWeek.equals("Monday")){
            System.out.println(2);
        } //continue for other days...

        //switch statement
        switch (dayOfTheWeek) {
            case "Sunday":
                System.out.println(1);
                break; //exit the current control structure
            case "Monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Invalid week day");
                break;
        }

        //Given a month number, determine how many days are in that month
        int monthNumber = 3;
        switch (monthNumber) {
            case 11, 4, 6, 9:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28, arguable 29, days");
                break;
            default:
                System.out.println("31 days");
                break;
        }
    }
}
