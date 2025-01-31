import java.util.ArrayList;

public class CookBook {
    public static void main(String[] args) {
        Ingredient i1 = new Ingredient(1, "tsp", "salt");
        Ingredient i2 = new Ingredient(2, "Cups", "flour");
        System.out.println(i1);
        System.out.println(i2);

        /*ArrayList<Integer> test = new ArrayList<>();
        test.add(0, 5);
        System.out.println(test);*/

        Recipe r1 = new Recipe("Cookies", 375, 60, 48);
        r1.addIngredient(i1);
        r1.addIngredient(i2);
        r1.addIngredient(2, "Cups", "Chocolate Chips");
        r1.addAction(0, "Mix Ingredients");
        r1.addAction(1, "Bake Cookies");
        r1.addAction(0, "Preheat Oven");
        System.out.println(r1);
        System.out.println(r1.containsAllergen("flour"));
        Recipe tripled = r1.scale(3);
        System.out.println(tripled);
    }
}
