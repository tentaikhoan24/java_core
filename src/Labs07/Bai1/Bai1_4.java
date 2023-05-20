package Labs07.Bai1;

public class Bai1_4 {
    public static void main(String[] args) {
        // cách 1
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));
        //cách 2
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
    }
}
