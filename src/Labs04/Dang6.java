package Labs04;

import java.io.*;

public class Dang6 {


    static boolean compare(String name1, String name2) {
        String[] arr1 = name1.trim().split("\\s+");
        String[] arr2 = name2.trim().split("\\s+");
        if (arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]) < 0){// Kiểm tra tên
            return true;
        }else if (arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]) > 0) {// Kiểm tra tên
            return false;
        } else if (arr1.length == 2 || arr2.length == 2) {//Kiểm tra họ nếu 1 trong 2 không có tên đệm
            if (arr1[0].compareTo(arr2[0]) < 0){
                return true;
            }else if (arr1[0].compareTo(arr2[0]) > 0) {
                return false;
            }
        } else {
            int index = 1;
            while (index < Math.min(arr1.length - 2, arr2.length - 2)){
                if (arr1[index].compareTo(arr2[index]) < 0){// Kiểm tên đệm
                    return true;
                }else if (arr1[index].compareTo(arr2[index]) > 0) {//Kiểm tên đệm
                    return false;
                }
                index++;
            }
            if (arr1.length < arr2.length){
                return true;
            } else {
                return false;
            }
        }
        return true;
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
            for (int i = 0; i < index-1 ; i++) {
                for (int j = i +1; j < index; j++){
                    if (!compare(name[i], name[j])) {
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
