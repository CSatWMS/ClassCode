package Unit6ArrayList;

public class CookBook {
    public static void main(String[] args) {
        //make an ingredient
        Ingredient i1 = new Ingredient(1 , "tsp", "salt");
        //print it out
        System.out.println(i1);

        Recipe r1 = new Recipe("Papi's Rice", 8, 3, 25);
        r1.addIngr(i1);
        r1.addIngr(1, "Cups", "Rice");
        r1.addIngr(2, "Cups", "Water");
        r1.addIngr(1, "TBSP", "Oil");
        System.out.println(r1);

        Recipe doubleBatch = r1.scaleIt(2);
    }
}
