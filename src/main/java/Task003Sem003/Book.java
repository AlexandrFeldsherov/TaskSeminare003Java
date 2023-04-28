package Task003Sem003;

public class Book {
    String name;
    String author;
    double price;
    int yearPublication;
    int numberPages;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", yearPublication=" + yearPublication +
                ", numberPages=" + numberPages +
                '}';
    }

    public Book(String name, String author, double price, int yearPublication, int numberPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.yearPublication = yearPublication;
        this.numberPages = numberPages;
    }
}
