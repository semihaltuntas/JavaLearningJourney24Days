package be.vdab.hello.j05;

public class Bmi {
    public static void main(String[] args) {
        float gewicht = 75.7F;
        float lengte = 1.70F;
        float bmi;

        bmi = gewicht / (lengte * lengte);
        System.out.println("de bodyIndex is " + bmi);
    }
}
