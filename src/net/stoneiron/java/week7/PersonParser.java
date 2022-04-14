package net.stoneiron.java.week7;

import java.util.Scanner;

public class PersonParser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민등록번호입력(- 생략) >> ");
        String str = scanner.nextLine();

        String year = str.substring(0, 2);
        String month = str.substring(2, 4);
        String date = str.substring(4, 6);
        int sex = Integer.parseInt(str.substring(6, 7));
        int place = Integer.parseInt(str.substring(7, 9));

        System.out.println("생년월일 : " + year + "년 " + month + "월 " + date + "일");
        if (sex % 2 == 1)
            System.out.println("구분 : 남성");
        else
            System.out.println("구분 : 여성");

        if (place == 44 || place == 96)
            System.out.println("출생지역 : 세종특별자치시");
        else if (place == 85 || place == 90)
            System.out.println("출생지역 : 울산광역시");
        else if (place <= 8)
            System.out.println("출생지역 : 서울특별시");
        else if (place <= 12)
            System.out.println("출생지역 : 부산광역시");
        else if (place <= 15)
            System.out.println("출생지역 : 인천광역시");
        else if (place <= 25)
            System.out.println("출생지역 : 경기도");
        else if (place <= 34)
            System.out.println("출생지역 : 강원도");
        else if (place <= 39)
            System.out.println("출생지역 : 충청북도");
        else if (place <= 41)
            System.out.println("출생지역 : 대전광역시");
        else if (place <= 47)
            System.out.println("출생지역 : 충청남도");
        else if (place <= 54)
            System.out.println("출생지역 : 전라북도");
        else if (place <= 56)
            System.out.println("출생지역 : 광주광역시");
        else if (place <= 66)
            System.out.println("출생지역 : 전라남도");
        else if (place <= 69)
            System.out.println("출생지역 : 대구광역시");
        else if (place <= 75)
            System.out.println("출생지역 : 경상북도");
        else if (place <= 76)
            System.out.println("출생지역 : 대구광역시");
        else if (place <= 81)
            System.out.println("출생지역 : 경상북도");
        else if (place <= 92)
            System.out.println("출생지역 : 경상남도");
        else if (place <= 95)
            System.out.println("출생지역 : 제주특별자치도");


    }

}
