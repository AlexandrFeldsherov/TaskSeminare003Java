package Task002Sem003;

public class ProductNew {
    String name;
    String countryOrigin;
    double weight;
    double price;
    String variety;

    public ProductNew(String name, String countryOrigin, double weight, double price, String variety) {
        this.name = name;
        this.countryOrigin = countryOrigin;
        this.weight = weight;
        this.price = price;
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                ", countryOrigin='" + countryOrigin + '\'' +
                ", weight=" + weight +
                ", price='" + price + '\'' +
                ", variety='" + variety + '\'' +
                '}';
    }
}
