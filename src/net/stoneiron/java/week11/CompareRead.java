package net.stoneiron.java.week11;

import java.io.*;

public class CompareRead {
    public static void main(String[] args) {
        try {
            FileReader fr1 = new FileReader("src/net/stoneiron/java/week11/test_long.txt");
            FileReader fr2 = new FileReader("src/net/stoneiron/java/week11/test_long.txt");
            char[] buf = new char[512];

            long start1 = System.currentTimeMillis();
            while (fr1.read() != -1) {
            }
            long end1 = System.currentTimeMillis();
            long start2 = System.currentTimeMillis();
            while (fr2.read(buf) == 512) {
            }
            long end2 = System.currentTimeMillis();

            long time1 = end1 - start1;
            long time2 = end2 - start2;
            System.out.println("read(): " + time1 + "ms, read(buf): " + time2 + "ms");
            fr1.close();
            fr2.close();
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
