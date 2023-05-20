package Labs07.Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bai3_1_1 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "iphone", 122f));
        list.add(new Product(2, "xiaomi", 123f));
        list.add(new Product(3, "samsung", 121f));
        list.add(new Product(4, "nokia", 120f));


        List<Float> floatList = new ArrayList<>();
        for (Product p : list) {
            if (p.price < 130f) {
                floatList.add(p.price);
            }
        }
        System.out.println(floatList);

    }
}