package Labs07.Bai5;

import java.util.*;

public class Bai5_2 {
    private static List<String> getList() {
        return null;
    }

    private static Optional<List<String>> getList2() {
        return Optional.ofNullable(null);
    }

    public static void main(String[] args) {
        //Không sử dụng Optional
        List<String> list = getList();
        List<String> listOpt = list != null ? list : new ArrayList<>();
        // Sử dụng Optional cách 1
        List<String> list1 = getList2().orElse(new ArrayList<>());

        //Sử dụng Optional cách 2
        List<String> list2 = getList2().orElseGet(() -> new ArrayList<>());
    }
}
