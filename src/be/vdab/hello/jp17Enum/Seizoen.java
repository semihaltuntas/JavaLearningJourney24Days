package be.vdab.hello.jp17Enum;

public enum Seizoen {
    LENTE(3),ZOMER(6),HERFST(9),WINTER(12);
    private final int beginMaand;

    Seizoen(int beginMaand){
        this.beginMaand = beginMaand;
    }

    public int getBeginMaand() {
        return beginMaand;
    }
}
