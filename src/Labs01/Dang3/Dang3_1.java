package Labs01.Dang3;

import java.util.Arrays;

public class Dang3_1 {
    public  static void main(String[] args) {
        int[] A = {5, 3, 7, 8, 4, 6, 8, 3, 8, 9};
        int [] pos = new int[A.length];
        int index = 0, length = 1, lengthMax = 1;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                length++;
                if (i == A.length - 2) {
                    if (length == lengthMax) {
                        index = i - lengthMax + 2;
                        pos[index] = lengthMax;
                    }

                    if (length > lengthMax) {
                        lengthMax = length;
                        index = i - lengthMax + 2;
                        pos[index] = lengthMax;
                    }
                }
            } else {
                if (length == lengthMax) {
                    index = i - lengthMax + 1;
                    pos[index] = lengthMax;
                }
                if (length > lengthMax) {
                    lengthMax = length;
                    index = i - lengthMax + 1;
                    pos[index] = lengthMax;
                }
                length = 1;
            }
        }

        System.out.println("Chieu dai day con dai nhat la: " + lengthMax);
        for (int i = 0; i < A.length; i++) {
            if (pos[i] == lengthMax) {
                System.out.println("Index: " + i + ":::" + Arrays.toString(Arrays.copyOfRange(A, i, i+lengthMax)));
            }


        }
    }
}
