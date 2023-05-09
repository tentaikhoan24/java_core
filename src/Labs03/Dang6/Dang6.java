package Labs03.Dang6;

public class Dang6 {
    static class InvalidNumber extends Exception {
        public InvalidNumber(String message) {
            super(message);
        }
    }

    static int Subtraction(int a, int b) throws InvalidNumber {
        if(a < b){
            throw new InvalidNumber("So thu nhat phai lon hơn so thu hai!!");
        }else {
            return a - b;
        }
    }

    public static void main(String[] args) {
        try{
            System.out.println(Subtraction(2, 1));
            System.out.println(Subtraction(1, 2));
        }catch (InvalidNumber e){
            System.err.println(e.getMessage());
        }
    }
}