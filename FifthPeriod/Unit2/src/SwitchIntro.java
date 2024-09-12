public class SwitchIntro {
    public static void main(String[] args) {
        String dayOfWeek = "F";
        if (dayOfWeek.equals("M") || dayOfWeek.equals("T")){
            System.out.println("Bored");
        }

        switch (dayOfWeek) {
            case "M", "T", "W":
                System.out.println("BORED");
                break;
            case "R", "F":
                System.out.println("HAPPY");
                break;
            case "Sa", "Su":
                System.out.println("Excited");
                break;
            default:
                System.out.println("Invalid day of week");
                break;
        }

        String month = "March";

        

    }
}

