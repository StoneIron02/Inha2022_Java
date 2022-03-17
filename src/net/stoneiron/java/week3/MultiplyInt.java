package net.stoneiron.java.week3;

import java.util.Scanner;

public class MultiplyInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("곱하고자 하는 두 수 입력>>");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + "×" + b + "=" + (a*b));

        scanner.close();
    }

}
