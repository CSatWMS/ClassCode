package Unit2;

public class SwitchIntro {
    public static void main(String[] args) {
        String dayOfWeek = "Thursday";
        if (dayOfWeek.equals("Sunday")){
            System.out.println(1);
        } else if (dayOfWeek.equals("Monday")){
            System.out.println(2);
        } //... list out all the days...

        //switch statement
        switch (dayOfWeek) {
            case "Sunday":
                System.out.println(1);
                break; //break exits the current control structure
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
                System.out.println("Invalid day of week");
                break;
        }


    }
}
