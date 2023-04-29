package Dang1;

public class Dang1_3 {

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static  void  main(String[] args) {
        int [] A={ 5, 1, 9, 10, 16};
        boolean check = true;

        for (int i = 0; i< A.length; i++) {
            if (!isPrimeNumber(A[i])) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("Day so nguyen to");
        }else System.out.println("Khong phai day so nguyen to");
    }
}
