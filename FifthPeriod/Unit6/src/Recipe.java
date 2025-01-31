import java.util.ArrayList;

public class Recipe {
    private ArrayList<Ingredient> ingrs;
    private ArrayList<String> actions;
    private int temp, time, servingSize;
    private String title;

    public Recipe(String title, int temp, int time, int servingSize){
        this.title = title;
        this.temp = temp;
        this.time = time;
        this.servingSize = servingSize;
        ingrs = new ArrayList<Ingredient>();
        actions = new ArrayList<String>();
    }

    public Recipe scale(double factor){
        //what changes
            //orig title x factor
            //ingredient (only quantity)
            //serving size
            //time
        //what stays the same
            //temperature
            //actions
        String newTitle = this.title + " x " + factor;
        int newTime = (int) (this.time * factor);
        int newServingSize = (int) (this.servingSize * factor);
        Recipe toReturn = new Recipe(newTitle, this.temp, newTime, newServingSize);
        for (Ingredient curr : ingrs){
            toReturn.addIngredient(curr.getQuantity() * factor, curr.getUnit(), curr.getName());
        }
        for (int i = 0; i < actions.size(); i++){
            toReturn.addAction(i, actions.get(i));
        }
        return toReturn;
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

    public void addIngredient(double quant, String unit, String name){
        Ingredient toAdd = new Ingredient(quant, unit, name);
        ingrs.add(toAdd);
    }

    public void addAction(int loc, String action){
        actions.add(loc, action);
    }

    public String toString(){
        String toReturn = title;
        toReturn += "\nServingSize: " + servingSize;
        toReturn += "\nTime: " + time;
        toReturn += "\nTemperature: " + temp;
        toReturn += "\nIngredients:";
        for (Ingredient ing : ingrs){
            toReturn += "\n\t" + ing;
        }
        toReturn += "\nActions:";
        for (int i = 0; i < actions.size(); i++){
            toReturn += "\n\tStep " + (i + 1) + ": " + actions.get(i);
        }
        return toReturn;
    }
}
