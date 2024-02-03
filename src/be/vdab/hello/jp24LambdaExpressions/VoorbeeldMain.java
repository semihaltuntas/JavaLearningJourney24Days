package be.vdab.hello.jp24LambdaExpressions;

import java.util.Arrays;

public class VoorbeeldMain {
    public static void main(String[] args) {

        EvenGetallen evenGetallen = getal -> getal % 2 == 0;
        System.out.println(evenGetallen.isEven(8));
        System.out.println(evenGetallen.isEven(9));


        String[] groenten = new String[]{"tomaat", "sla", "ui", "prei"};
        String[] fruiten = new String[]{"apple", "lemon", "cherry", "banana"};

        Arrays.sort(groenten, (groenten1, groenten2) -> groenten1.length() - groenten2.length());
        Arrays.sort(fruiten, (fruiten1, fruiten2) -> fruiten1.compareTo(fruiten2));
        System.out.println(Arrays.toString(groenten));
        System.out.println(Arrays.toString(fruiten));
    }
}
