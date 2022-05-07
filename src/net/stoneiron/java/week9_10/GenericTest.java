package net.stoneiron.java.week9_10;

class Item<T> {
    private T data;

    public T get() {
        return data;
    }

    public void set(T data) {
        this.data = data;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        Item<Integer> intItem = new Item<Integer>();
        Item<Double> doubleItem = new Item<Double>();
        Item<String> stringItem = new Item<String>();
        intItem.set(1);
        doubleItem.set(1.0);
        stringItem.set("String");
        System.out.println(intItem.get());
        System.out.println(doubleItem.get());
        System.out.println(stringItem.get());
    }
}
