package Labs01.Dang1;

public class Dang1_1 {
    public static void main(String[] args) {
        int [] A={5, 7, 9, 10, 16};
        boolean check = true;

        for (int i = 0; i< A.length - 1; i++) {
            if(A[i] > A[i+1]) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("Day tang dan");
        }else System.out.println("Day khong tang dan");
    }
}
