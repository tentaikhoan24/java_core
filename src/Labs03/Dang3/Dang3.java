package Labs03.Dang3;

public class Dang3 {
    public static void test() {
        int a[] = new int[5];
        try {
            a[6] = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Loi tran mang");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0");
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        test();
    }
}
