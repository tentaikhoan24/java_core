package Dang8;
public class Dang8_3 {
    public static void main(String[] args) {
        int count = 0;
        String[] list = {"Nguyễn Văn Quân", "Nguyễn Quân Văn", "Nguyễn Văn Văn", "Quân Văn Nguyễn", "Nguyễn Thị Quân"};

        for(String i: list) {
            if(i.substring(0, 6).equals("Nguyễn") && i.substring(i.length() - 4).equals("Quân")){
                count++;
            }
        }
        for(String i: list) {
            System.out.println(i);
        }
        System.out.println("So nguoi co ho la Nguyen va ten la Quan la: " + count);
    }
}
