package Labs07.Bai1;

@FunctionalInterface
interface  Sayable{
    String say ( String message);
}
public class Bai1_6 {
    public static void main(String[] args) {
        Sayable person = message -> {
            return "I would you likr to say, " + message;
        };
        System.out.println(person.say("time is precious."));
    }
}