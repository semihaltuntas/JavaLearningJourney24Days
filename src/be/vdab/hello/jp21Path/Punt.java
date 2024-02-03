package be.vdab.hello.jp21Path;

import java.io.Serializable;

public class Punt {
//    private static final long serialVersionUID = 1L;
    private final int x;
    private final int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return x + " : " + y;
    }
}
