package Task004Sem003;

import java.util.*;

public class Task004Sem003 {

    /**
     * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            lst.add(r.nextInt(100));
        }
        System.out.println("lst = " + lst);
        int sumLst=0;
        Collections.sort(lst);
        for (int i = 0; i < lst.size(); i++) {
            sumLst+=lst.get(i);
        }
        System.out.println("min lst="+lst.get(0)+";max lst ="+ lst.get(lst.size()-1)
                +";среднее lst = "+sumLst/lst.size());
    }
}
