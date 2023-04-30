package Labs01.Dang1;

public class Dang1_2 {
    public  static void  main(String[] args) {
        int [] A={5, -1, 9, -10, 16};
        boolean check = true;

        for (int i = 0; i< A.length - 1; i++) {
            if (A[i]*A[i+1] > 0) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("Day dan dau");
        }else System.out.println("Day khong dan dau");
    }
}
