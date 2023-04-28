package Task003Sem003;

import java.util.ArrayList;
import java.util.List;

public class Task003Sem003 {

    /**
     * Сведения о книге состоят из
     * названия,
     * фамилии автора,
     * цены,
     * года издания и
     * количества страниц.
     * Найти названия книг, в которых
     * простое количество страниц,
     * фамилия автора содержит «А» и
     * год издания после 2010 г, включительно
     *
     * @param args
     */
    public static void main(String[] args) {
        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков", 236, 1940, 300);
        Book book2 = new Book("Мёртвые души", "Николай Гоголь", 400, 1928, 359);
        Book book3 = new Book("Отцы и дети", "Иван Тургенев", 586, 1861, 286);
        Book book4 = new Book("Старик и море", "Эрнест Хемингуэй", 358, 1952, 247);
        Book book5 = new Book("Измененные", "Сергей Лукьяненко А", 568, 2021, 307);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        int yearPublication = 2010;
        String authorSymbol = "А";
        productSearchByGrade(books, yearPublication, authorSymbol);
    }

    /**
     * Поиск по критериям
     *
     * @param books
     * @param yearPublication
     * @param authorSymbol
     */
    private static void productSearchByGrade(List<Book> books, int yearPublication, String authorSymbol) {
        List<String> nameBookSearch = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).author.contains(authorSymbol)
                    && books.get(i).yearPublication >= yearPublication
                    && primeNumber(books.get(i).numberPages)) {
                if (!nameBookSearch.contains(books.get(i).name)) {
                    nameBookSearch.add(books.get(i).name);
                }
            }
        }
        System.out.println("nameBookSearch = " + nameBookSearch);
    }

    /**
     * Определяет примитивное число или нет
     *
     * @param s int
     * @return true or false
     */
    private static boolean primeNumber(int s) {
        boolean j = false;
        if (s == 1) {
            j = true;
        }
        for (int i = 2; i < s; i++) {
            j = (s % i != 0);
            if (!j) {
                break;
            }
        }
        return j;
    }
}
