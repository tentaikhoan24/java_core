package Labs07.Bai2;

interface Sayable{
    void say();
}

public class Bai2_1 {
    public static void saySomething() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Sayable sayable = Bai2_1 ::saySomething;

        sayable.say();
    }
}