package be.vdab.hello.voorbeelden8hfstdGetal;

public class Getal {
    //public int x;
    private int x;

    public Getal(int a) {
        //x=a;
        setX(a);
    }

    public void print() {
        System.out.println("x= " + x);
    }

    public int absolut() {
        return Math.abs(x);
    }

    public int som(int a) {
        return x + a;
    }

    public void add(int a) {
        x = x + a;
    }

    public float som(float f) {
        return x + f;
    }

    public double som(double d) {
        return x + d;
    }

    public double toDouble() {
        return (double) x;
    }

    public void setX(int a) {
        this.x = a;
    }

    public int getX() {
        return x;
    }
}
