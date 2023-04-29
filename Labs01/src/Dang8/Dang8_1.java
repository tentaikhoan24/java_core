package Dang8;

public class Dang8_1 {
    public static void main(String args[]) {
        String s1 = "Cho một xâu kí tự?gồm các từ cách nhau.bởi dấu cách, chấm, phảy, hỏi chấm";
        String[] words = s1.split("[ ,?.]");
        int lengthMax = 0;
        String[] wordsMax = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= lengthMax) {
                lengthMax = words[i].length();
            }
        }

        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == lengthMax) {
                int check = 0, count = 0;
                while (check != 1){
                    if (words[i].equals(wordsMax[count])) {
                        check = 1;
                    } else if (wordsMax[count] == null) {
                        wordsMax[count] = words[i];
                        check = 1;
                    }
                    count++;
                }
            }
        }

        for (String i: wordsMax){
            if (i != null)
                System.out.println(i);
        }
    }
}
