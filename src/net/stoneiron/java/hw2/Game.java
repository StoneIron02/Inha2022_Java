package net.stoneiron.java.hw2;

import java.util.Scanner;

public class Game {
    public static Scanner scanner;
    private static Police police;
    private static Thief thief;
    private static final House[][] houses = new House[3][3];

    public static void start() {
        scanner = new Scanner(System.in);
        police = new Police();
        thief = new Thief();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                houses[i][j] = new House(i, j);
            }
        }
    }

    public static void print() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (houses[j][i].collide(police))
                    System.out.print(police.getShape());
                else if (houses[j][i].collide(thief))
                    System.out.print(thief.getShape());
                else
                    System.out.print(houses[j][i].getShape());
            }
            System.out.println();
        }
    }

    public static boolean allRobbed() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!houses[i][j].isRobbed())
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("강석철/컴퓨터공학과/12211554");
        System.out.println("** 도둑 잡기 게임 시작**");
        start();
        while (true) {
            // 상황출력
            print();
            if (thief.move()) {
                houses[thief.getX()][thief.getY()].setRobbed(true);
            }
            police.move();
            if (police.collide(thief)) {
                print();
                System.out.println("당신이 졌습니다.");
                scanner.close();
                return;
            }
            if (allRobbed()) {
                print();
                System.out.println("당신이 이겼습니다!");
                scanner.close();
                return;
            }
        }
    }

}
