package Labs07.Bai1;

interface  SayAble{
    String say(String name);
}

public class Bai1_2 {
    public static void main(String[] args) {
        //cach 1
        SayAble s1 = (name) -> {
            return "Hello " + name;
        };
        System.out.println(s1.say("Dung"));
        // cach 2
        SayAble s2 = name -> {
            return "Hello " + name;
        };
        System.out.println(s2.say("Hoang"));
    }

}