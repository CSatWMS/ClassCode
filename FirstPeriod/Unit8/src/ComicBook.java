import java.util.ArrayList;

public class ComicBook {
    public static void main(String[] args) {
        ArrayList<String> hulkPowers = new ArrayList<>();
        hulkPowers.add("SMASH");
        hulkPowers.add("Turn Green");
        ComicCharacter char1 = new GoodGuy("Hulk", 45, "Marvel", "Earth", 100, 98,
                7, "Bruce Banner", "Hulk SMASH", hulkPowers, false, "The Avengers");
        System.out.println(char1);
        ComicCharacter char2 = new GoodGuy("Batman", 30, "DC", "Earth", 10, 87,
                0, "Bruce Wayne", "I AM VENGEANCE", null, true, "Justice League");
        System.out.println(char2);
        System.out.println(((Fighter)char1).fight( (Fighter) char2));

        SideCharacter sc = new SideCharacter("Uncle Ben", 62, "DC", "New York", 2, 86, 10, 6);
        SideKick sk = new SideKick("Robin", 17, "DC", "Gotham", 8, 96,
                8, 9, (MainCharacter) char2);

        ComicCharacter[] people = {char1, char2, sc, sk};
        for (ComicCharacter c : people){
            System.out.println(c);
        }

        for (int i = 0; i < people.length; i++){
            for (int j = 0; j < people.length; j++){
                if (i != j){
                    System.out.println(people[i].getName() + " interacts with " + people[j].getName());
                    people[i].interactWith(people[j]);
                }
            }
        }
    }
}
