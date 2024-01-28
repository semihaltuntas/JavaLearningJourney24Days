package be.vdab.hello.j05;

public class Temperatuur {
    public static void main(String[] args) {
        double tempCelsius =37.0F;
        double tempFahr = tempCelsius *9/5+32;

        System.out.println("Temperatuur in graden Celsius: "+ tempCelsius);
        System.out.println("temperatuur in graden Fahrenheit: " + tempFahr);
    }
}
