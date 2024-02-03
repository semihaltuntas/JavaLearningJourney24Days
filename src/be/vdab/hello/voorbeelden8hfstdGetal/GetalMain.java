package be.vdab.hello.voorbeelden8hfstdGetal;

public class GetalMain {
    public static void main(String[] args) {
//    var getalA =new Getal();
//    System.out.println(getalA.x);

        var getalA = new Getal(-45);
        getalA.print();

        var absWaarde = getalA.absolut();
        System.out.println("absolute waarde van x = " + absWaarde);

        var som = getalA.som(7);
        System.out.println("som van x en a " + som);

        getalA.add(56);
        getalA.print();

        var f = getalA.som(123.67F);
        System.out.println("som van x en float " + f);

        var d = getalA.som(1234567.98765);
        System.out.println("som van x en double " + d);

        var xd = getalA.toDouble();
        System.out.println("toDouble van x " + xd);

        getalA.setX(99);
        getalA.print();
        var xx = getalA.getX();
        System.out.println("getX geeft " + xx);

    }

}
