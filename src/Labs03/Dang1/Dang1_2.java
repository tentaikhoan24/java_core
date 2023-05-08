package Labs03.Dang1;

import javax.swing.*;

public class Dang1_2 {
    public static void main(String[] args) {

        // Enter the following values and see what exception is caught.
        //    0, 4, character, <no value>
        try {

            String value = JOptionPane.showInputDialog(null, "Enter value:");

            // Nếu giá trị nhập vào không phải là số sẽ xảy ra ngoại lệ NumberFormatException
            int divisor = Integer.parseInt(value);

            // If the divisor is 0, it will result in ArithmetricException
            System.out.println(3/divisor);

        } catch ( NumberFormatException e ){
            throw new NumberFormatException();
//            System.out.println("khong phai la so");
        } catch (ArithmeticException e) {
            System.out.println("So khong");;
        } finally {
            System.out.println("Finally");
        }
        System.out.println("After exception.");
    }

}
