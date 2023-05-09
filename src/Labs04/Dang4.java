package Labs04;

import java.io.*;

public class Dang4 {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("data/invoice.dat"));
        double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
        int[] units = {12, 8, 13, 29, 50};
        String[] descs = {"Java 1", "Java 2", "Java SE", "Java EE", "Java Key Chain"};
        for (int i = 0; i < prices.length; i++) {
            out.writeDouble(prices[i]);
            out.writeChar('\t');
            out.writeInt(units[i]);
            out.writeChar('\t');
            out.writeChars(descs[i]);
            out.writeChar('\n');
        }
        out.close();
        DataInputStream in = new DataInputStream(new FileInputStream("data/invoice.dat"));
        double price;
        int unit;
        StringBuffer desc;
        double total = 0.0;

        String lineSepString = System.getProperty("line.separator");
        char lineSep = lineSepString.charAt(lineSepString.length() - 1);
        try {
            while (true) {
                price = in.readDouble();
                in.readChar();
                unit = in.readInt();
                in.readChar();
                char chr;
                desc = new StringBuffer(20);
                while ((chr = in.readChar()) != lineSep) desc.append(chr);
                System.out.println("You've ordered " + unit + " units of " + desc + " at $" + price);
                total = total + unit * price;
            }
        } catch (EOFException e) {
        }
        System.out.println("For a TOTAL of: $" + total);
        in.close();
    }
}