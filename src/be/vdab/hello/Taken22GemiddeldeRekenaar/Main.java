package be.vdab.hello.Taken22GemiddeldeRekenaar;

import javax.swing.plaf.TableHeaderUI;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] getallen = new double[1000000];
        Random random = new Random();
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = random.nextDouble();
        }
        // Arrays.stream(getallen).forEach(System.out::println);
        var gemiddeldeRekenaar1 = new GemiddeldeRekenaar(getallen, 0, getallen.length / 2);
        var gemiddeldeRekanaar2 = new GemiddeldeRekenaar(getallen, getallen.length / 2, getallen.length);

        var thread1 = Thread.startVirtualThread(gemiddeldeRekenaar1);
        var thread2 = Thread.startVirtualThread(gemiddeldeRekanaar2);

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

        System.out.println(gemiddeldeRekenaar1.getGemiddelde());
        System.out.println(gemiddeldeRekanaar2.getGemiddelde());

        System.out.println("Gemiddelde :" + (gemiddeldeRekenaar1.getGemiddelde() +
                gemiddeldeRekanaar2.getGemiddelde()) / 2);

    }
}
