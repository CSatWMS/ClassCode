public class Country implements Measurable{
    private int GDP;
    private String name;

    public Country(String name, int GDP){
        this.name = name;
        this.GDP = GDP;
    }

    public int getMeasure(){
        return GDP;
    }


}
