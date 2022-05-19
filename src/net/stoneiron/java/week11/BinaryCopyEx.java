package net.stoneiron.java.week11;

import java.io.*;
import java.util.Scanner;

public class BinaryCopyEx {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Source file name: ");
            BufferedInputStream bi = new BufferedInputStream(new FileInputStream(scanner.nextLine()));
            System.out.print("Destination file name: ");
            BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(scanner.nextLine()));

            long start = System.currentTimeMillis();
            int c;
            while ((c = bi.read()) != -1) {
                bo.write((byte) c);
            }
            long end = System.currentTimeMillis();
            bi.close();
            bo.close();
            scanner.close();
            System.out.println("복사하였습니다.");
            System.out.println("소요 시간: " + (end - start) + "ms");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}

