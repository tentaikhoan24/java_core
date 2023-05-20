package Labs07.Bai2;

public class Bai2_2 {
    public void saySomething() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        //cach 1
        Bai2_2 bai2_2 = new Bai2_2();
        Sayable sayable = bai2_2::saySomething;
        sayable.say();

        //cah 2
        Sayable sayable1 = new Bai2_2()::saySomething;
        sayable1.say();
    }
}