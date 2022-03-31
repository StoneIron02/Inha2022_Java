package net.stoneiron.java.week5;

class Pen {
    private int amount;
    Pen(int amount) { this.amount = amount; }
    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }
}

class ColorPen extends Pen {
    private String color;
    ColorPen(int amount, String color) {
        super(amount);
        this.color = color;
    }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}

class SharpPencil extends Pen {
    private int width;
    SharpPencil(int amount, int width) {
        super(amount);
        this.width = width;
    }
    public int getWidth() { return width; }
}

class BallPen extends ColorPen {
    BallPen(int amount, String color) { super(amount, color); }
}

class FountainPen extends ColorPen {
    FountainPen(int amount, String color) { super(amount, color); }
    public void refill(int n) { setAmount(n); }
}

public class SimpleEx {
    public static void print(Pen pen) {
        if (pen instanceof SharpPencil sp) {
            System.out.println("샤프의 수는 " + sp.getAmount() + " 굵기는 " + sp.getWidth());
        } else if (pen instanceof BallPen bp) {
            System.out.println("볼펜의 수는 " + bp.getAmount() + " 색깔은 " + bp.getColor());
        } else if (pen instanceof FountainPen fp) {
            System.out.println("만년필의 수는 " + fp.getAmount() + " 색깔은 " + fp.getColor());
        }
    }

    public static void main(String [] args) {
        Pen[] pens = new Pen[3];
        pens[0] = new SharpPencil(10, 5);
        pens[1] = new BallPen(5, "빨간색");
        pens[2] = new FountainPen(2, "검은색");
        for (Pen pen : pens) {
            print(pen);
        }
    }

}
