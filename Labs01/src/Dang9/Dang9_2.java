package Dang9;

public class Dang9_2 {
    public static void main(String[] args) {
        String[] str = {"tentaikhoan24@gmail.com", "mothai babon@gmail.com", "mothai@abcxyz", "tentaikhoan"};
        String regex = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        for (String i: str) {
            if (i.matches(regex)){
                System.out.println(i + ": Hop le");
            }else {
                System.out.println(i + ": Khong hop le");
            }
        }
    }
}
