package Labs04;

import java.io.*;

public class Dang6 {


    static Integer compare(String name1, String name2) {
        String[] arr1 = name1.trim().split("\\s+");
        String[] arr2 = name2.trim().split("\\s+");
<<<<<<< HEAD

=======
>>>>>>> 533b68863e496fe44478f29364b4562fb9f8fb6c

        String str1 = arr1[arr1.length - 1] + " " + arr1[0];
        for (int i = 1; i < arr1.length - 1; i++) {
            str1 += " " + arr1[i];
        }

        String str2 = arr2[arr2.length - 1] + " " + arr2[0];
        for (int i = 1; i < arr2.length - 1; i++) {
            str2 += " " + arr2[i];
        }

        return str1.compareTo(str2);

    }
    public static void main(String[] args) {
        String[] name = new String[50];
        int index = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader("data/DanhSach.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("data/OutputDanhSach.txt"));
            String line;
            while ((line = in.readLine()) != null){
                name[index] = line;
                index ++;
            }
            for (int i = 0; i < index - 1 ; i++) {
                for (int j = 0; j < index  -1; j++){
                    if (compare(name[i], name[j]) < 0) {
                        String temp = name[i];
                        name[i] = name[j];
                        name[j] = temp;
                    }
                }
            }

            for (int i = 0; i < index; i++) {
                out.write(name[i]);
                out.newLine();
            }

            in.close();
            out.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}