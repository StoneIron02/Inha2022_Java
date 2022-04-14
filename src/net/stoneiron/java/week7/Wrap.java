package net.stoneiron.java.week7;

public class Wrap {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = Integer.valueOf(10);
        int c = 10;

        if (a == c) // 자동 박싱, 언박싱에 의해 true
            System.out.println("a == c");
        if (a.equals(c))
            System.out.println("a is equal to c"); // 자동 박싱, 언박싱에 의해 true
        if (a == b) // 객체끼리는 레퍼런스끼리 비교하므로 false
            System.out.println("a == b");
        if (a.equals(b)) // 내부 값을 비교하므로 true
            System.out.println("a is equal to b");
    }

}
