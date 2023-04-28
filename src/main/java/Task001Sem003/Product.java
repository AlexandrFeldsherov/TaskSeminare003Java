package Task001Sem003;

public class Product {
    String nameProdukt;
    Integer price;
    String variety;

    @Override
    public String toString() {
        return "Product{" +
                "nameProdukt='" + nameProdukt + '\'' +
                ", price=" + price +
                ", variety='" + variety + '\'' +
                '}';
    }

    public Product(String nameProdukt, Integer price, String variety) {
        this.nameProdukt = nameProdukt;
        this.price = price;
        this.variety = variety;
    }
}
