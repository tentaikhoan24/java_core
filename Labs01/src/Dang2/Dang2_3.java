package Dang2;

import java.util.Arrays;

public class Dang2_3 {
    public  static void main(String[] args) {
        int[] A = {5, 1, 9, 10, 16, 4, 6, 8, 3, 5, 7, 9, 10, 15, 10, 16, 4, 6, 8, 2};
        int index = 0, length = 1, lengthMax = 1;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i]%2 == 0 && A[i + 1]%2 == 0) {
                length++;
                if (i == A.length - 2) {
                    if (length > lengthMax) {
                        lengthMax = length;
                        index = i - lengthMax + 2;
                        System.out.println("Index: "+index + "------Length: " + lengthMax);
                    }
                }
            } else {
                if (length > lengthMax) {
                    lengthMax = length;
                    index = i - lengthMax + 1;
                }
                length = 1;
            }
        }

        System.out.println("Day con so chan dai nhat: " + lengthMax);
        for (int i = 0; i < A.length; i++) {
            if (i >= index && i <= index + lengthMax)
                System.out.println(A[i]);
        }
    }
}
