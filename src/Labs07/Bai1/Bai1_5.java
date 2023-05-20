package Labs07.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Bai1_5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("x1");
        list.add("x2");
        list.add("x3");
        list.add("x4");
        list.add("x5");

        list.forEach(
                System.out::println
        );

    }
}