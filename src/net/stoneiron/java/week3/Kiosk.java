package net.stoneiron.java.week3;

import java.util.Scanner;

public class Kiosk {

    public static void main(String[] args) {
        String[] menu = {"에스프레소", "아메리카노", "카페라떼", "카푸치노"};
        int[] price = {1800, 2000, 2800, 3000};

        System.out.println("메뉴판");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " : " + price[i]);
        }

        System.out.print("원하는 메뉴를 입력하세요(띄어쓰기로 메뉴 구분, 마지막에는 '주문' 입력)>>");
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String order = scanner.next();
            if (order.equals("주문")) {
                break;
            }
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equals(order)) {
                    sum += price[i];
                }
            }
        }

        System.out.println("전체 금액은 " + sum + "원입니다.");

    }

}
