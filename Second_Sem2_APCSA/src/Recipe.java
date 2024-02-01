import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<Ingredient> ingrList;
    private ArrayList<String> stepList;
    private int servingSize, prepTime, cookTime;

    public Recipe(String name, int s, int p, int c){
        this.name = name;
        servingSize = s;
        prepTime = p;
        cookTime = c;
        ingrList = new ArrayList<Ingredient>();
        stepList = new ArrayList<String>();
    }

    //GOAL: create a new, scaled recipe
        //name: originalName x factor
            //papi's rice x 3
    //update ingr amounts, serving size, all else is the same
    public Recipe scaleIt(double factor){
        String newName = this.name + " x " + factor;
        int newServsingSize = (int) (servingSize * factor);
        Recipe toReturn = new Recipe(newName, this.prepTime, this.cookTime, newServsingSize);
        for (Ingredient currIngr : ingrList){
            double newAmount = currIngr.getQuantity() * factor;
            toReturn.addIngr(newAmount, currIngr.getUnit(), currIngr.getName());
        }
        return toReturn;
    }

    public void addIngr(Ingredient i){
        ingrList.add(i);
    }

    public void addIngr(double quant, String unit, String name){
        Ingredient toAdd = new Ingredient(quant, unit, name);
        ingrList.add(toAdd);
    }

    public void addStep(String step){
        stepList.add(step);
    }

    public void addStep(String step, int location){
        stepList.add(location, step);
    }

    public String toString(){
        String toReturn = name;
        toReturn += "\n";
        //loop over ingredients
        for (int i = 0; i < ingrList.size(); i++) {
            //add each ingredient's toString to the toReturn
            toReturn += "\t" + ingrList.get(i) + "\n";
        }
        //ignore steps for now...
        //add additional info
        toReturn += "Serving Size: " + servingSize + "\n";
        toReturn += "Prep Time: " + prepTime + "\n";
        toReturn += "Cook Time: " + cookTime + "\n";
        return toReturn;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ingredient> getIngrList() {
        return ingrList;
    }

    public ArrayList<String> getStepList() {
        return stepList;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public int getCookTime() {
        return cookTime;
    }
}
