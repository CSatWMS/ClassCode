public class Power {
    private String ability;
    private int rating;

    public Power(String ability, int rating) {
        this.ability = ability;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Power{" +
                "ability='" + ability + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
