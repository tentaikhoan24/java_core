package Labs07.Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
public class Bai4 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "HDDSa", 122f));
        list.add(new Product(2, "HDDSb", 122f));
        list.add(new Product(3, "HDDSl", 122f));
        list.add(new Product(4, "HDDSx", 122f));

        // Convert List into Set
        Set<Float> set = list.stream().filter(p -> p.price < 130).map(p -> p.price).collect(Collectors.toSet());
        System.out.println(set);


        // Convert List into Map
        Map<Integer, String> map = list.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
        System.out.println(map);
    }
}
