package net.stoneiron.java.hw2;

import static net.stoneiron.java.hw2.Game.scanner;

public class Thief extends GameObject {

    public Thief() {
        super(2, 2);
    }

    @Override
    protected boolean move() {
        while (true) {
            System.out.print("위(w), 왼쪽(a), 아래(s), 오른쪽(d), 도둑질(r) 선택 >> ");
            String key = scanner.next();
            switch (key) {
                case "a": // left
                    if (x == 0)
                        continue;
                    x--;
                    return false;
                case "d": // right
                    if (x == 2)
                        continue;
                    x++;
                    return false;
                case "w": // up
                    if (y == 0)
                        continue;
                    y--;
                    return false;
                case "s": // down
                    if (y == 2)
                        continue;
                    y++;
                    return false;
                case "r":
                    return true;
            }
        }
    }

    @Override
    protected char getShape() {
        return '&';
    }
}
