package Labs03.Dang7;

public class Dang7 {
    static class InvalidNumber extends Exception {
        public InvalidNumber(String message) {
            super(message);
        }
    }

    static class InvalidSymbol extends InvalidNumber {
        public InvalidSymbol(String message) {
            super(message);
        }
    }


    static int Subtraction(int a, int b) throws InvalidNumber { //Phép trừ cấp 1
        if (a < 0 || b < 0) {
            throw new InvalidSymbol("Hai so phai lon hon 0!!!");
        }
        if(a < b){
            throw new InvalidNumber("So thu nhat phai lon hơn so thu hai!!!");
        }else {
            return a - b;
        }
    }

    public static void main(String[] args) {
        try{
            System.out.println(Subtraction(2, 1));
            System.out.println(Subtraction(1, 2));
            System.out.println(Subtraction(2, -1));
        }catch (InvalidNumber e) {
            System.err.println(e.getMessage());
        }
    }
}
