package Labs01.Dang8;

public class Dang8_2 {
    public static void main(String[] args) {
        String str = "Cho đoạn văn bản gồm các câu cách nhau bởi dấu chấm.hãy chuẩn hóa văn " +
                "bản đó bằng cách viết hoa đầu câu, trước dấu chấm ko có dấu cách, sau dấu chấm " +
                "phải có dấu cách.";
        String[] sentence = str.split("\\.");
        String newStr = sentence[0];

        for (int i = 0; i < sentence.length; i++) {
            String fristLetter = sentence[i].substring(0,1).toUpperCase();
            String remainingLetter = sentence[i].substring(1, sentence[i].length());
            sentence[i] = fristLetter + remainingLetter;
        }

        if (sentence.length == 1){
            newStr += ".";
        } else {
            for(int i = 1; i < sentence.length; i++) {
                newStr += ". " + sentence[i];
            }
            newStr += ".";
        }

        System.out.println("Doan van sau chuan hoa: " + newStr);
    }

}
