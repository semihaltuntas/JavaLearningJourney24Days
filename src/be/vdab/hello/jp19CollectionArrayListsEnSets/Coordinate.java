package be.vdab.hello.jp19CollectionArrayListsEnSets;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashCode() {
        int som = x + y;
        return som % 7;
    }
}
