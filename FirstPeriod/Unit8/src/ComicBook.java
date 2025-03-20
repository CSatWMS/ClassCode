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
    }
}
