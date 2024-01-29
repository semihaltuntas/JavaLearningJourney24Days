package be.vdab.hello.jp08;

public class Varargs {
    public static void main(String[] args) {

        System.out.println(somVanAlleGetallen(1,4,7));
    }
    public static int somVanAlleGetallen(int... getallen) {
        int som = 0;
        for (int getal : getallen) {
            som += getal;
        }
        return som;
    }


}
