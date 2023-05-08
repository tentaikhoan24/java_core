package Labs03.Dang2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Paths;

public class Dang2 {
    public static void cat(File file)  {//Có thể sửa thành cat(String filePath)
        RandomAccessFile input = null;
        String line = null;
        try {
            input = new RandomAccessFile(file.toString(), "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;

        } catch(FileNotFoundException fnf) {
            System.err.format("File: %s not found%n", file);
        } catch(IOException e) {
            System.err.println(e.toString());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch(IOException io) {
                }
            }
        }
    }

    public static void main(String[] args) {
        cat(new File("C:/Users/HLC_2021/Desktop/New folder/LA31/java_core/rm.txt"));
    }
}
