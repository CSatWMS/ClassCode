package Unit6ArrayList;

import java.util.ArrayList;
public class Recipe {
    private String name;
    private ArrayList<Ingredient> ingrList;
    private ArrayList<String> stepList;
    private int prepTime, cookTime, servingSize;

    public Recipe(String name, int p, int c, int s){
        this.name = name;
        prepTime = p;
        cookTime = c;
        servingSize = s;
        ingrList = new ArrayList<Ingredient>();
        stepList = new ArrayList<String>();
    }

    //GOAL: create a new, scaled recipe
        //name: originalName x factor
            //papi's x 3
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

    //GOAL: write add step method
        //overload so it can also be inserted at a location
        //test in CookBook- add some steps!
    public void addStep(String step){
        stepList.add(step);
    }

    public void addStep(String step, int location){
        stepList.add(location, step);
    }

    public void addIngr(double q, String u, String n){
        Ingredient i = new Ingredient(q, u, n);
        ingrList.add(i);
    }

    public void addIngr(Ingredient i){
        ingrList.add(i);
    }

    public String toString(){
        String toReturn = name;
        toReturn += "\n";
        for (int i = 0; i < ingrList.size(); i++){
            toReturn += "\t";
            toReturn += ingrList.get(i);
            toReturn += "\n";
        }
        toReturn += "---Step List---\n";
        for (String s : stepList){
            toReturn += s + "\n";
        }
        toReturn += "---Addnl info---\n";
        toReturn += "Serving size: " + servingSize + "\n";
        toReturn += "Prep Time: " + prepTime + "\n";
        toReturn += "Cook Time: " + cookTime + "\n";
        return toReturn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
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

    public int getPrepTime() {
        return prepTime;
    }

    public int getCookTime() {
        return cookTime;
    }

    public int getServingSize() {
        return servingSize;
    }
}
