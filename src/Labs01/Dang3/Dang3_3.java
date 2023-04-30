package Labs01.Dang3;

import java.util.Arrays;

public class Dang3_3 {
    public static void main(String[] args) {
        int [] A = {5, 1, 2, 4, 9, 100,16, 4,6, 8, 300};
        int [] pos = new int[A.length];
        int index =0, sum = 0, length = 1;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i]%2 == 0 && A[i+1]%2 == 0){
                length ++;
                if (i == A.length -2) {
                    sum += A[i+1];
                    index = i - length + 2;
                    pos[index] = length;
                }
            }else{
                index = i - length + 1;
                pos[index] = length;
                length = 1;
            }

        }

        for (int i = 0; i < A.length; i++) {
            if (pos[i] > 1) {
                System.out.println("Index: " + i + "--Length: " + pos[i]);
//                System.out.println(Arrays.toString(Arrays.copyOfRange(A, i, pos[i])));
            }
        }
    }
}
