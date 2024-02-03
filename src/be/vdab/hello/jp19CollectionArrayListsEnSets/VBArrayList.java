package be.vdab.hello.jp19CollectionArrayListsEnSets;

import java.util.ArrayList;
import java.util.List;

public class VBArrayList {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("fiets");
        a1.add(null);
        a1.add("even");
        a1.add("dak");
        a1.add("citroen");
        a1.add("citroen");
        a1.add("boom");
        a1.add("aap");
        a1.set(5, "Audi");

        System.out.println("a1 :" + a1);
        System.out.println("4e element is: " + a1.get(3));
        System.out.println("add 5.element = audi " + a1.set(5, "Audi"));
        System.out.println("Voorbeeld van een ArrayList :");

        for (String woord : a1) {
            System.out.println(woord);
        }
        System.out.println("------");


        System.out.println("\nWeergave m.b.v. iterator");
        for (var i = a1.iterator(); i.hasNext(); ) {
            var woord = i.next();
            System.out.println(woord);
        }
        System.out.println("---------");
        a1.add(3,"test");
        a1.stream().forEach(System.out::println);



    }

}

