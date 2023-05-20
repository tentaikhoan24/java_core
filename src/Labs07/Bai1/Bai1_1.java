package Labs07.Bai1;

@FunctionalInterface
interface  Drawable{
    void draw();
}

public class Bai1_1 {
    public static void main(String[] args) {
        int width = 10;
        Drawable d2 = () -> {
            System.out.println("Drawing " + width );
        };

        d2.draw();
    }
}