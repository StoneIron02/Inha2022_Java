package net.stoneiron.java.hw2;

public class Police extends GameObject {

    public Police() {
        super(0, 0);
    }

    @Override
    protected boolean move() {
        while (true) {
            int n = (int) (Math.random() * 5);
            switch (n) {
                case 0: // left
                    if (x == 0)
                        continue;
                    x--;
                    return false;
                case 1: // right
                    if (x == 2)
                        continue;
                    x++;
                    return false;
                case 2: // up
                    if (y == 0)
                        continue;
                    y--;
                    return false;
                case 3: // down
                    if (y == 2)
                        continue;
                    y++;
                    return false;
                case 4: // stop
                    return false;
            }
        }
    }

    @Override
    protected char getShape() {
        return 'P';
    }
}
