package Unit6;

public class Ingredient {
    //private dataType varName;
    private double amount;
    private String unit;
    private String name;

    /*
    public ClassName(paramDT paramName, etc) {
        this.varName = paramName;
    }
     */

    public Ingredient(double amount, String u, String n){
        this.amount = amount;
        unit = u;
        name = n;
    }

    public String toString(){
        return amount + " " + unit + " " + name;
    }

    //public String toString() { return str; }

    //public dt getVarName() { return varName; }

    //public void setVarName(dt paramName) { this.varName = paramName; }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
