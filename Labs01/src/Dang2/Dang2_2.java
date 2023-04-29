package Dang2;

import java.util.Arrays;

public class Dang2_2 {
    public  static void main(String[] args) {
        int [] A={5, 1, 9, 10, 16, 4, 6, 8, 3, 1, 9, 10, 16, 20};
        int index = 0, length = 1, lengthMax = 1, sum = 0, sumMax = 0;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]){
                length ++;
                sum+= A[i];
                if (i == A.length - 2) {
                    if (length > lengthMax) {
                        lengthMax = length;
                        index = i - lengthMax + 2;
                        sumMax = sum + A[i+1];
                        System.out.println("Index: "+index + "------Length: " + lengthMax);
                    }
                }
            }else{
                sum += A[i];
                if (length > lengthMax && sum > 20) {
                    lengthMax = length;
                    index = i - lengthMax + 1;
                    sumMax = sum;
                }
                length = 1;
                sum = 0;
            }
        }

        System.out.println("Day con dai nhat: " +lengthMax + ", tong = " +sumMax);
//        System.out.println(Arrays.toString(Arrays.copyOfRange(A, index, lengthMax+1)));
        for (int i = 0; i < A.length; i++) {
            if (i >= index && i <= index + lengthMax)
                System.out.println(A[i]);
        }
    }

}

