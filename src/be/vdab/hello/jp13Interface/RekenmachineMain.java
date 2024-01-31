package be.vdab.hello.jp13Interface;

public class RekenmachineMain implements Rekenmachine {
    public static void main(String[] args) {

        RekenmachineMain calculator = new RekenmachineMain();
        calculator.toonAllEvenNummers(2,4,6,8);
        calculator.toonAlleOnevenNummers(1,3,5,7,8);
        calculator.toonAllEvenNummers(2,3,5,7,9,3,4);

    }
}
