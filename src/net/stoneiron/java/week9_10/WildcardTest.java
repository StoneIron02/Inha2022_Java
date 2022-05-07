package net.stoneiron.java.week9_10;

public class WildcardTest {

    static double max1(Item<? extends Number> x, Item<? extends Number> y) {
        double r = 0.0;
        double dx = x.get().doubleValue();
        double dy = y.get().doubleValue();
        if (dx > dy) r = dx;
        else r = dy;
        return r;
    }

    static String concat(Item<?> i1, Item<?> i2) {
        return i1.get().toString() + i2.get().toString();
    }

    public static void main(String[] args) {
        Item<Integer> i1 = new Item<Integer>();
        Item<Double> d1 = new Item<Double>();
        Item<String> s1 = new Item<String>();
        i1.set(10);
        d1.set(10.1);
        s1.set("Hello");
        String s = concat(i1, s1);
        System.out.println(s);
    }

}
