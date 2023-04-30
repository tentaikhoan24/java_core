package Labs01.Dang3;

public class Dang3_2 {
    public static void main(String[] args) {
        int [] A = {5, 1, 9, 100,16, 4,6, 8, 300};
        int [] pos = new int[A.length];
        int index =0, sum = 0, length = 1;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i+1]){
                sum += A[i];
                length ++;
                if (i == A.length -2) {
                    sum += A[i+1];
                    index = i - length + 2;
                    if (sum > 100)
                        pos[index] = length;
                }
            }else{
                sum += A[i];
                if (sum > 100) {
                    index = i - length + 1;
                    pos[index] = length;
                }
                length = 1;
                sum = 0;
            }

        }

        for (int i = 0; i < A.length; i++) {
            if(pos[i] != 0) {
                System.out.println("Index: " + i + "--Length: " + pos[i]);
            }
        }
    }
}
