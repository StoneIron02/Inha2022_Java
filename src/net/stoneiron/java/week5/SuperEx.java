package net.stoneiron.java.week5;

class A {
    public A() {
        this(10);
        System.out.println(" 기본 생성자 호출");
    }
    public A(int x) {
        System.out.print("A"+x);
    }
}
class B extends A {
    public B() {
        super(100);
        System.out.println(" 기본 생성자 호출");
    }
    public B(int x) {
        this();
        System.out.print("B"+x);
    }
}
public class SuperEx
{
    public static void main(String [] args) {
        B
                b = new B(20);
    }
}

