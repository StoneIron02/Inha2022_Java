package net.stoneiron.java.week4;

import java.util.Scanner;

class Circle {
    private String name;
    private double x, y;
    private int radius;

    public Circle(String name, double x, double y, int radius) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println(name + "의 위치는 (" + x + "," + y
                + "), 반지름은 " + radius);
    }

    public void changePosition(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("바퀴의 위치가 (" + this.x + ","
                + this.y + ")로 변경됨");
    }
}

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle[] c = new Circle[3];
        for (int i = 0; i < c.length; i++) {
            System.out.print(i + "번 원의 이름, x좌표, y좌표, 반지름 입력 >>");
            c[i] = new Circle(scanner.next(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt());
            c[i].show();
        }
        System.out.print("위치를 바꾸고 싶은 원의 번호와 변경할 x, y 좌표 입력 >>");
        c[scanner.nextInt()].changePosition(scanner.nextDouble(), scanner.nextDouble());
        scanner.close();
    }


}
