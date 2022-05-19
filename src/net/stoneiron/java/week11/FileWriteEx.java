package net.stoneiron.java.week11;

import java.io.*;

public class FileWriteEx {

    public static void main(String[] args) {
        try {
            FileOutputStream fout1 = new FileOutputStream("src/net/stoneiron/java/week11/test1.txt");
            FileWriter fout2 = new FileWriter("src/net/stoneiron/java/week11/test2.txt");
            byte[] b = {1, 2, 3, 2, 1};
            fout1.write(b);
            fout2.write("Java Programming");
            fout1.close();
            fout2.close();

            fout1 = new FileOutputStream("src/net/stoneiron/java/week11/test1.txt", true);
            fout2 = new FileWriter("src/net/stoneiron/java/week11/test2.txt", true);
            fout1.write(b);
            fout2.write("Java Programming");
            fout1.close();
            fout2.close();
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

}