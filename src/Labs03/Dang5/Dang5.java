package Labs03.Dang5;

import java.util.Scanner;

public class Dang5 {
    static class InvalidInput extends Exception{
        public InvalidInput(String mess) {
            super(mess);
        }
    }
    static int factorial(int number) throws InvalidInput {
        int facto = 1;
        if (number > 99) {
            throw  new InvalidInput("So lon hon 99");
        } else {
            int n = 1;
            while (++n <= number) {
                facto *= n;
            }
        }
        return facto;
    }


    public static void main(String[] args) {
        int inputX, result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap input: ");
        inputX = scanner.nextInt();
        try {
            result = factorial(inputX);
            System.out.println(result);
        } catch (InvalidInput e) {
            System.out.println(e.getMessage());
        }

    }
}
