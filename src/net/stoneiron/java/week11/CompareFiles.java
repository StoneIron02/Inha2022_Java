package net.stoneiron.java.week11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CompareFiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("File1 name: ");
            FileInputStream fin1 = new FileInputStream(scanner.nextLine());
            System.out.print("File2 name: ");
            FileInputStream fin2 = new FileInputStream(scanner.nextLine());

            int read1;
            while ((read1 = fin1.read()) != -1) {
                int read2 = fin2.read();
                if (read2 == -1) {
                    System.out.println("Different");
                    return;
                }
                if (read1 != read2) {
                    System.out.println("Different");
                    return;
                }
            }
            if (fin2.read() == -1) {
                System.out.println("Different");
                return;
            }
            System.out.println("Equal");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
