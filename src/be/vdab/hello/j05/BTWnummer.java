package be.vdab.hello.j05;

public class BTWnummer {
    public static void main(String[] args) {

        int btwNummer = 213252520;
        int deeltal = btwNummer / 100;
        byte rest = (byte) (deeltal % 97);
        //System.out.println(rest);
        byte laatste2Cijfers = (byte) (btwNummer % 100);
        //System.out.println("laatste2Cijfers = " + laatste2Cijfers);
        System.out.println(laatste2Cijfers == 97 - rest);

    }
}
