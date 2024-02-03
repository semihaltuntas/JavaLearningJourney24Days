package be.vdab.hello.TakenEnumHfstk18;

public enum Geslacht {
    MAN(1),VROUW(2),X(3);
    private final int nummer;

    Geslacht(int nummer) {
        this.nummer = nummer;
    }

    public int getNummer() {
        return nummer;
    }
}
