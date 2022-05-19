package net.stoneiron.java.week11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddLineNum {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/net/stoneiron/java/week11/test_long.txt");
            Scanner sc = new Scanner(fr);

            FileWriter fw = new FileWriter("src/net/stoneiron/java/week11/test_long-line.txt");

            int i = 1;
            while (sc.hasNext()) {
                fw.write(i + "\t");
                fw.write(sc.nextLine() + "\n");
                i++;
            }
            fr.close();
            sc.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
