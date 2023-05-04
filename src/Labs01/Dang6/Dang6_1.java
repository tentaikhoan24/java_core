package Labs01.Dang6;

public class Dang6_1 {
    public static void main(String[] args) {
        StackCustom stackCustom = new StackCustom();
        int A = 91;
        while (A != 0) {
            stackCustom.push(A%2);
            A = A/2;
        }
        stackCustom.display();
    }
}
