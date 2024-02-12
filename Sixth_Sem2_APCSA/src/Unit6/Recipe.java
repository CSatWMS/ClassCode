package Unit6;

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

    //GOAL: write a scaleIt method
        //this will return a brand new recipe
            //name : orignl x factor
                //Papi's Rice x 3
        //preptimes, cooktimes, and steps won't change
        //ingredient amounts will change (units, and name won't)
        //serving size will change
    public Recipe scaleIt(double factor){
        String newName = this.name + " x " + factor;
        int newServsingSize = (int) (servingSize * factor);
        Recipe toReturn = new Recipe(newName, this.prepTime, this.cookTime, newServsingSize);
        for (Ingredient currIngr : ingrList){
            double newAmount = currIngr.getAmount() * factor;
            toReturn.addIngr(newAmount, currIngr.getUnit(), currIngr.getName());
        }
        return toReturn;
    }

    //GOAL: taking in ingredients and adding them to the list
    public void addIngr(Ingredient i){
        ingrList.add(i);
    }

    public void addIngr(double amount, String unit, String name){
        Ingredient i = new Ingredient(amount, unit, name);
        ingrList.add(i);
    }

    public String toString(){
        String toReturn = name;
        toReturn += "\n";
        for (int i = 0 ; i < ingrList.size(); i++){
            Ingredient currIngr = ingrList.get(i);
            toReturn += "\t" + currIngr.toString() + "\n";
        }
        toReturn += "-----Addnl Info-----\n";
        toReturn += "Cook Time: " + cookTime + "\n";
        toReturn += "Pre Time: " + prepTime + "\n";
        toReturn += "Serving Size: " + servingSize + "\n";
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
