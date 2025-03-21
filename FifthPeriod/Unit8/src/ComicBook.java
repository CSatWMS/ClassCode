public class ComicBook {
    public static void main(String[] args) {
        GoodGuy gg = new GoodGuy("Batman", "DC", "Gotham", 10, 8, null,
                "Bruce Wayne", "I AM VENGEANCE", "Black", null, true, "Justice League");
        BadGuy bg = new BadGuy("Joker", "DC", "?", 8, 9, null,
                "Jack", "Why so serious?", gg, true);

        gg.interactWith(bg);
        bg.escape();
        bg.interactWith(gg);
    }
}
