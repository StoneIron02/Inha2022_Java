package net.stoneiron.java.week4;

public class CircleEx {
    int radius;
    String name;

    public CircleEx() {
    }
    
    public CircleEx(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }
    
    public CircleEx(String name) {
        this(name, 1);
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public void changeRadius(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        CircleEx pizza;
//        pizza = new Circle();
//        pizza.radius = 10;
//        pizza.name = "자바피자";
        pizza = new CircleEx("자바피자", 10);
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        pizza.changeRadius(11);
        area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        CircleEx donut = new CircleEx("도넛");
//        Circle donut = new Circle();
//        donut.radius = 2;
//        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }

}
