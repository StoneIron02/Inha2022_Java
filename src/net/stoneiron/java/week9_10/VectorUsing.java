package net.stoneiron.java.week9_10;

import java.util.Scanner;
import java.util.Vector;

public class VectorUsing {

    private static double getAve(Vector<? extends Number> vector) {
        double sum = 0;
        for (Number number : vector)
            sum += number.doubleValue();
        return sum / vector.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();
        while (true) {
            System.out.print("숫자를 입력하세요 >> ");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("종료합니다");
                break;
            }
            vector.add(num);
            System.out.println("누적 평균은 " + getAve(vector));
        }
    }

}
