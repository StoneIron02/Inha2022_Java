package net.stoneiron.java.hw1;

import java.util.Scanner;

class Menu {
    private final String name;
    private final int price;
    private int num;
    private int orderCount;

    Menu(String name, int price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
        this.orderCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    public void addNum(int num) {
        this.num += num;
    }

    public void subNum(int num) {
        this.num -= num;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }
}

public class Kiosk {
    private static Menu[] menus;

    public static void printMenu() {
        System.out.println("[메뉴판]");
        for (Menu menu : menus) {
            System.out.println(menu.getName() + ":" + menu.getPrice() + "원(재고:" + menu.getNum() + ")");
        }
    }

    public static void order() {
        for (Menu menu : menus) {
            if (menu.getNum() < menu.getOrderCount()) {
                System.out.println("재고가 부족한 상품이 있습니다. 다시 주문해주세요.");
                resetOrderCount();
                return;
            }
        }

        int sum = 0;
        for (Menu menu : menus) {
            sum += menu.getPrice() * menu.getOrderCount();
            menu.subNum(menu.getOrderCount());
        }
        System.out.println("전체 금액은 " + sum + "원입니다.");
        resetOrderCount();
    }

    public static void masterMode(Scanner scanner) {
        System.out.println("[관리자 모드]");
        while (true) {
            System.out.print("관리자 모드를 나가려면 '종료', 재고 변경을 원하면 메뉴 이름을 입력하세요 >> ");
            String selectMenu = scanner.next();
            if (selectMenu.equals("종료"))
                break;
            for (Menu menu : menus) {
                if (menu.getName().equals(selectMenu)) {
                    System.out.print(menu.getName() + "의 재고는 현재 " + menu.getNum() + "입니다. 추가 수량을 입력해주세요 >> ");
                    menu.addNum(scanner.nextInt());
                    break;
                }
            }
        }
    }

    public static void resetOrderCount() {
        for (Menu menu : menus) {
            menu.setOrderCount(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("강석철 / 컴퓨터공학과 / 12211554");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("[키오스크 초기화]");
        System.out.print("판매하고자 하는 메뉴 종류 수를 입력하시오>> ");
        menus = new Menu[scanner.nextInt()];
        for (int i = 0; i < menus.length; i++) {
            System.out.print("판매하고자 하는 " + i + "번 메뉴 이름, 가격, 재고 순으로 입력하시오. (띄어쓰기 순) >> ");
            menus[i] = new Menu(scanner.next(), scanner.nextInt(), scanner.nextInt());
        }
        System.out.println("[초기화 완료]");
        System.out.println();

        while (true) {
            printMenu();
            System.out.println("원하는 메뉴를 입력하세요(띄어쓰기로 메뉴 구분, 마지막에는 '주문' 입력) >> ");

            while (true) {
                String word = scanner.next();
                if (word.equals("종료")) {
                    System.out.println("종료되었습니다.");
                    return;
                } else if (word.equals("주문")) {
                    order();
                    break;
                } else if (word.equals("재고관리")) {
                    masterMode(scanner);
                    break;
                } else {
                    for (Menu menu : menus) {
                        if (menu.getName().equals(word)) {
                            menu.setOrderCount(menu.getOrderCount() + 1);
                        }
                    }
                }
            }

        }
    }

}
