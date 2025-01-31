public class Ingredient {
    private double measure;
    private String name;
    private String unit;

    public Ingredient(double m, String u, String n){
        measure = m;
        name = n;
        unit = u;
    }

    public double getMeasure() {
        return measure;
    }

    public void setMeasure(double measure) {
        this.measure = measure;
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
        return measure + " " + unit + " " + name;
    }
}
