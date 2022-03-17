package net.stoneiron.java.week3;

public class ex2 {

    public static void main(String[] args) {
        int b = 19;
        int a = b > 2 || b++ <= 5 ? 3 : 5;
        System.out.println("a=" + a + " b=" + b);
    }

}
