public class CookBook {
    public static void main(String[] args) {
        Ingredient i1 = new Ingredient(2, "Cups", "Flour");
        Ingredient i2 = new Ingredient(1, "Tsp", "Baking Soda");
        System.out.println(i1);
        System.out.println(i2);

        Recipe r1 = new Recipe("Cookies", 48, 10, 40, 2);
        r1.addIngredient(i1);
        r1.addIngredient(i2);
        r1.addIngredient(2, "Cups", "Chocolate Chips");
        r1.addDirection("Mix Ingredients");
        r1.addDirection("Bake Cookies");
        System.out.println(r1);
        System.out.println(r1.containsAllergen("Flour"));

        Recipe tripled = r1.scale(3);
        System.out.println(tripled);
    }
}
