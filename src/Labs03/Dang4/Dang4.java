package Labs03.Dang4;

public class Dang4 {
    static class InvalidInput extends Throwable{
        public InvalidInput(String mess) {
            super(mess);
        }
    }
    int factorial(int number) throws  InvalidInput{
        int facto = 1;
        if (number > 99) {
            throw  new  InvalidInput("So lon hon 99");
        } else {
            int n = 1;
            while (++n <= number) {
                facto *= n;
            }
        }
        return facto;
    }


    public static void main(String[] args) throws InvalidInput {
        int input, x;
        Dang4 test = new Dang4();
        Dang4 test2 = new Dang4();
        try {
            System.out.println(test.factorial(12));
            System.out.println(test2.factorial(100));
        } catch (InvalidInput e) {
            System.out.println(e);
        }
    }
}

