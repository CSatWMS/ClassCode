package Unit6;

public class CookBook {
    public static void main(String[] args) {
        //Make an ingredient
        //print it out
        Ingredient i1 = new Ingredient(1, "tsp", "salt");
        System.out.println(i1);

        Recipe r1 = new Recipe("Papi's Rice", 3, 25, 8);
        r1.addIngr(i1);
        r1.addIngr(1, "cup", "rice");
        r1.addIngr(2, "cups", "water");
        r1.addIngr(1, "TBSP", "oil");
        System.out.println(r1);

        Recipe tripleBatch = r1.scaleIt(3);
        System.out.println(tripleBatch);
    }
}
