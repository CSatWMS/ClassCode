public class Ingredient {
    //private dataType varName;
    private double quantity;
    private String unit, name;

    /*
    public ClassName(paramDT paramName, etc) {
        this.varName = paramName;
    }
     */

    public Ingredient(double q, String u, String n){
        quantity = q;
        this.unit = u;
        name = n;
    }
    public String toString() {
        return quantity + " " + unit + " " + name;
    }

    //public dt getVarName()
    // { return varName; }

    //public void setVarName(dt paramName)
    // { this.varName = paramName; }


    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
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
