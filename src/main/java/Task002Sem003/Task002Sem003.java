package Task002Sem003;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task002Sem003 {

    /**
     * Сведения о товаре состоят из
     * -наименования,
     * -страны-производителя,
     * -веса,
     * -цены,
     * -сорта.
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     *
     * @param args
     */
    public static void main(String[] args) {
        ProductNew pr01 = new ProductNew("рис", "индия", 1, 56, "1");
        ProductNew pr02 = new ProductNew("греча", "россия", 1, 76, "высший");
        ProductNew pr03 = new ProductNew("фасоль", "китай", 2, 115, "2");
        ProductNew pr04 = new ProductNew("нут", "китай", 1, 59, "1");
        ProductNew pr05 = new ProductNew("бобы", "россия", 5, 35, "высший");
        ProductNew pr06 = new ProductNew("чечевица", "узбекистан", 3, 84, "1");
        ProductNew pr07 = new ProductNew("ячмень", "россия", 5, 17, "2");
        List<ProductNew> productNewList = new ArrayList<>();
        productNewList.add(pr01);
        productNewList.add(pr02);
        productNewList.add(pr03);
        productNewList.add(pr04);
        productNewList.add(pr05);
        productNewList.add(pr06);
        productNewList.add(pr07);
        System.out.println("Введите сорт нужного товара (высший/1/2) :  ");
        Scanner variety = new Scanner(System.in);
        String varietyNew = variety.next();
        productSearchByGrade(productNewList, varietyNew);

    }

    private static void productSearchByGrade(List<ProductNew> productNewList, String variety) {
        double priceProduct = 2147483647;
        String country="нет страны";
        for (int i = 0; i < productNewList.size(); i++) {
            if (productNewList.get(i).variety.equals(variety)) {
                if (priceProduct > (productNewList.get(i).price / productNewList.get(i).weight)) {
                    priceProduct = productNewList.get(i).price / productNewList.get(i).weight;
                    country = productNewList.get(i).countryOrigin;
                }
            }
        }
        System.out.println("priceProduct = " + priceProduct);
        System.out.println("country = " + country);

    }
}