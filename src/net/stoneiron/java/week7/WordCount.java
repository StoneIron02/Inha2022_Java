package net.stoneiron.java.week7;

import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("그만")) {
                System.out.println("종료합니다.");
                break;
            }
            System.out.println("어절 개수는 " + line.split(" ").length);
        }

        scanner.close();
    }

}
