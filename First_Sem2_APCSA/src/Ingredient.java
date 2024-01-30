public class Ingredient {
    //private dataType varName;
    private double quantity;
    private String unit;
    private String name;

    /*
    public ClassName(paramDataType paramName, etc){
        this.varName = paramName;
    }
    */
    public Ingredient(double q, String u, String n){
        quantity = q;
        unit = u;
        name = n;
    }

    public String toString(){
        return quantity + " " + unit + " " + name;
    }

    //public void setVarName(dt varName)
    // {this.varName = varName;}

    //public dt getVarName()
    // { return varName;}


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
