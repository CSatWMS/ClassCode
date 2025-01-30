import java.util.ArrayList;

public class Recipe {
    private ArrayList<Ingredient> ingrs;
    private String[] directions;
    private int servingSize, prepTime, cookTime;
    private String name;

    public Recipe(String name, int ss, int pT, int cT, int numDirections){
        this.name = name;
        servingSize = ss;
        prepTime = pT;
        cookTime = cT;
        directions = new String[numDirections];
        ingrs = new ArrayList<Ingredient>();
    }

    //Scale
        //factor parameter
        //return a new recipe object
            //new name -> "orig name" x factor

    //would stay the same
        //directions
    //would change
        //ingredient quantity changes
        //serving size
        //times
    public Recipe scale(double factor){
        String newName = this.name + " x " + factor;
        int newServingSize = (int) (this.servingSize * factor);
        int newCookTime = (int) (cookTime * factor);
        int newPrepTime = (int) (prepTime * factor);
        Recipe scaled = new Recipe(newName, newServingSize, newPrepTime, newCookTime, directions.length);
        for (Ingredient curr : ingrs){
            scaled.addIngredient(curr.getQuantity() * factor, curr.getUnit(), curr.getName());
        }
        for (String step : directions){
            scaled.addDirection(step);
        }
        return scaled;

    }

    public boolean containsAllergen(String allergy){
        for (int i = 0; i < ingrs.size(); i++){
            if (ingrs.get(i).getName().equals(allergy)){
                return true;
            }
        }
        return false;
    }

    public void addIngredient(Ingredient i){
        ingrs.add(i);
    }

    public void addIngredient(double q, String u, String name){
        Ingredient i = new Ingredient(q, u, name);
        ingrs.add(i);
    }

    public void addDirection(String direction){
        int spot = 0;
        while (directions[spot] != null){
            spot++;
            if (spot == directions.length){
                System.out.println("No spots left!");
                return;
            }
        }
        directions[spot] = direction;
    }

    public String toString() {
        String toReturn = name;
        toReturn += "\nServing size: " + servingSize;
        toReturn += "\nPrep Time: " + prepTime;
        toReturn += "\nCook Time: " + cookTime;
        toReturn += "\nIngredients:";
        for (Ingredient curr : ingrs){
            toReturn += "\n\t" + curr;
        }
        toReturn += "\nSteps:";
        for (int i = 0; i < directions.length; i++){
            toReturn += "\n\tStep " + (i + 1) + ": " + directions[i];
        }
        return toReturn;
    }
}
