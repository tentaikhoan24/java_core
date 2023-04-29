package Dang9;

public class Dang9_1 {
    public static void main(String[] args) {
        String[] str = {"tentaikhoan24", "mothai babon", "mothai", "tentaikhoan"};
        String regex = "[a-z0-9_-]{6,12}$";
        for (String i: str) {
            if (i.matches(regex)){
                System.out.println(i + ": Hop le");
            }else {
                System.out.println(i + ": Khong hop le");
            }
        }
    }
}
