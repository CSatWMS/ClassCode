import java.util.ArrayList;

public class Recipe {
    private ArrayList<Ingredient> ingrs;
    private String tools;
    private ArrayList<String> steps;
    private int time, servingSize;
    private String name;

    public Recipe(String name, int servingSize, int time, String tools){
        this.name = name;
        this.servingSize = servingSize;
        this.tools = tools;
        this.time = time;
        ingrs = new ArrayList<Ingredient>();
        steps = new ArrayList<String>();
    }

    public Recipe scale(double factor){
        //What will Change
            //orig name x factor
            //ingredient quantity
            //serving size
        //What will stay the same
            //tools
            //steps
            //time
        String newName = this.name + " x " + factor;
        int newServingSize = (int) (this.servingSize * factor);
        Recipe toReturn = new Recipe(newName, newServingSize, this.time, this.tools);
        for (int i = 0; i < steps.size(); i++){
            toReturn.addStep(i, this.steps.get(i));
        }
        for (Ingredient ing : ingrs){
            toReturn.addIngredient(ing.getMeasure() * factor, ing.getUnit(), ing.getName());
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

    public void addIngredient(double quantity, String unit, String name){
        Ingredient toAdd = new Ingredient(quantity, unit, name);
        ingrs.add(toAdd);
    }

    public void addStep(int stepNumber, String step){
        steps.add(stepNumber, step);
    }

    public String toString(){
        String toReturn = "";
        toReturn += name;
        toReturn += "\nServing Size: " + servingSize;
        toReturn += "\nTime: " + time;
        toReturn += "\nTools: " + tools;
        toReturn += "\nIngredients:";
        for (Ingredient curr : ingrs){
            toReturn += "\n\t" + curr;
        }
        toReturn += "\nSteps:";
        for (int i = 0; i < steps.size(); i++){
            toReturn += "\n\tStep " + (i + 1) + ": " + steps.get(i);
        }
        return toReturn;
    }
}
