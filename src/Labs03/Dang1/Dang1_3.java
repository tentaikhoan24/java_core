package Labs03.Dang1;

import java.io.*;
public class Dang1_3 {
    private int [] arr;
    private static final int SIZE = 10;
    public Dang1_3() {
        arr = new int [SIZE];
        for (int i = 0; i < SIZE; i++)
            arr[i]=i;
    }
    public  void writeList() throws IOException {
        PrintWriter out = null;
        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < (SIZE + 1) ; i++)
                System.out.println("Value at: " + i + " = " + arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException();
        } catch (IOException e) {
            throw new IOException(e);
        } finally {
            if (out != null) {
                System.out.println("Finally: Closing PrintWriter");
                out.close();
            } else {
                System.out.println("Finally: PrintWriter not open");
            }
        }
    }
    public static void main(String[] args) {
        Dang1_3 lst= new Dang1_3();
        try {
            lst.writeList();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}