public class Ingredient {
    //instance variables
    private double quantity;
    private String name;
    private String unit;

    public Ingredient(double quant, String u, String n){
        quantity = quant;
        name = n;
        unit = u;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String toString(){
        return quantity + " " + unit + " " + name;
    }
}
