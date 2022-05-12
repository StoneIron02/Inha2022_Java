package net.stoneiron.java.hw2;

public class House extends GameObject {
    private boolean robbed = false;

    public House(int x, int y) {
        super(x, y);
    }

    @Override
    protected boolean move() {
        return false;
    }

    @Override
    protected char getShape() {
        if (isRobbed())
            return '-';
        else
            return '^';
    }

    public boolean isRobbed() {
        return robbed;
    }

    public void setRobbed(boolean robbed) {
        this.robbed = robbed;
    }
}
