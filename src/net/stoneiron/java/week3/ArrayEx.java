package net.stoneiron.java.week3;

import java.util.Scanner;

public class ArrayEx {

    public static void main(String[] args) {
        int[] numList = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numList[i] = Integer.parseInt(args[i]);
        }

        System.out.print("정수를 입력하세요>>");
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        System.out.print("매개변수 중 " + check + "보다 큰 정수는 ");
        for (int num : numList) {
            if (check < num) {
                System.out.print(num + " ");
            }
        }
        System.out.println("입니다.");
    }

}
