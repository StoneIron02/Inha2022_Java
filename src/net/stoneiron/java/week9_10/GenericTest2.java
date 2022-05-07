package net.stoneiron.java.week9_10;

public class GenericTest2 {

    public static void main(String[] args) {
        Rect<Integer> r1 = new Rect<Integer>(1, 2);
        System.out.println(r1);
        Rect<Double> r2 = new Rect<Double>(1.1, 2.2);
        System.out.println(r2);
    }

}
