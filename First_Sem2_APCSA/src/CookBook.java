public class CookBook {
    public static void main(String[] args) {
        Ingredient i1 = new Ingredient(1, "tsp", "salt");
        System.out.println(i1);

        Recipe r1 = new Recipe("Papi's Rice", 3, 25, 8);

        r1.addIngr(i1);
        r1.addIngr(1, "cups", "rice");
        r1.addIngr(2, "cups", "water");
        r1.addIngr(1, "TBSP", "Oil");

        r1.addStep("Sautee rice in oil");
        r1.addStep("Add water");
        r1.addStep("Bring to a boil");
        r1.addStep("Heat Pan", 0);
        System.out.println(r1);
    }
}
