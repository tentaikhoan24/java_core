package Labs07.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Bai1_7 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "iphone", 122f));
        list.add(new Product(2, "xiaomi", 123f));
        list.add(new Product(3, "samsung", 121f));
        list.add(new Product(4, "nokia", 120f));

        Collections.sort(list, (p1, p2) -> {
                    return p1.name.compareTo(p2.name);
                }
        );

        list.forEach((n) ->{
            System.out.println(n.id + " " + n.name + " " + n.price);
        });
    }
}
