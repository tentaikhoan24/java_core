package Labs07.Bai2;

interface  Messageable{
    Message getMessage (String mgs);
}

class Message {
    Message(String msg){
        System.out.println(msg);
    }
}

public class Bai2_3 {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("hello");
    }
}