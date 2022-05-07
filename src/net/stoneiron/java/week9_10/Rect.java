package net.stoneiron.java.week9_10;

public class Rect<T extends Number> {
    private T width;
    private T height;

    public Rect(T width, T height) {
        this.width = width;
        this.height = height;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public String toString() {
        return "Rect [width=" + width + ", height=" + height + "]";
    }

}
