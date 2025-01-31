public class Ingredient {
    //instance variables
        //private dt varName;
    private String name;
    private double quantity;
    private String unit;

    //public ClassName(parameters)
    public Ingredient(double quant, String unit, String n){
        quantity = quant;
        this.unit = unit;
        name = n;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
//toString

    public String toString(){
        return quantity + " " + unit + " " + name;
    }
}
