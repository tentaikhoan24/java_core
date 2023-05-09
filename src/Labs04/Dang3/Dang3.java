package Labs04.Dang3;

public class Dang3 {
    public static void main(String[] args) {
        String a0, a1, a2;
        a0 = "Data/words.txt";
        a1 = "Data/wordsOut.txt";
        a2 = "3"; // dịch đi 3 vị trí
        SimpleEncryption se  = new SimpleEncryption();

        se.encrypt(a0, a1, Integer.parseInt(a2));// Mã hóa file
        System.out.println("Hiển thị file đã bị mã hóa");
        se.viewFileContent(a1);
    }
}
