public class CookBook {
    public static void main(String[] args) {
        Ingredient i1 = new Ingredient(1, "tsp", "salt");
        Ingredient i2 = new Ingredient(2, "cups", "flour");
        System.out.println(i1);
        System.out.println(i2);

        Recipe r1 = new Recipe("Cookies", 48, 60, "Mixer, Baking Sheet");
        r1.addIngredient(i1);
        r1.addIngredient(i2);
        r1.addIngredient(2, "cups", "chocolate chips");
        r1.addStep(0, "Mix Ingredients");
        r1.addStep(1, "Bake Cookies");
        System.out.println(r1);
        System.out.println(r1.containsAllergen("flour"));

        Recipe tripled = r1.scale(3);
        System.out.println(tripled);
    }
}
