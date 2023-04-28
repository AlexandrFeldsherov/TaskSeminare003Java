package Task001Sem003;

import java.util.ArrayList;
import java.util.List;

public class Task001 {

    /**
     * Дан массив записей:
     * наименование товара,
     * цена, сорт.
     * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
     *
     * @param args
     */
    public static void main(String[] args) {
        Product pr = new Product("мука", 69, "высший");
        Product pr02 = new Product("бобы высший", 78, "1 сорт");
        Product pr03 = new Product("греча высший", 59, "1 сорт");
        Product pr04 = new Product("рис высший", 57, "2 сорт");
        List<Product> productList = new ArrayList<>();
        productList.add(pr);
        productList.add(pr02);
        productList.add(pr03);
        productList.add(pr04);
        int priceProductFirstVariety = 0;
        int priceProductSecondVariety = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).variety.equals("1 сорт") && productList.get(i).nameProdukt.contains("высший")) {
                if (productList.get(i).price > priceProductFirstVariety) {
                    priceProductFirstVariety = productList.get(i).price;
                }
            }
            if (productList.get(i).variety.equals("2 сорт") && productList.get(i).nameProdukt.contains("высший")) {
                if (productList.get(i).price > priceProductSecondVariety) {
                    priceProductSecondVariety = productList.get(i).price;
                }
            }

        }
        System.out.println("priceProductFirstVariety = " + priceProductFirstVariety);
        System.out.println("priceProductSecondVariety = " + priceProductSecondVariety);
    }

}
