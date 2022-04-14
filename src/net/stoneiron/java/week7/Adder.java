package net.stoneiron.java.week7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Adder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("더하기 수식 입력>> ");
        String str = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(str, "+");

        int sum = 0;
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }

}
