package be.vdab.hello.jp19CollectionArrayListsEnSets;

import java.util.LinkedList;

public class VBLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Fiets");
        ll.add(null);
        ll.add("even");
        ll.add("dak");
        ll.add("citroen");
        ll.add("citroen");
        ll.add("boom");
        ll.add("aap");

        System.out.println("4e element is :" + ll.get(3));
        ll.add(3, "test");
        System.out.println("Voorbeeld van een LinkedList");
        for (var woord : ll) {
            System.out.println(woord);
        }
        System.out.println("----------");
        System.out.println("\n Weergave m.b.v. iterator");
        for (var i = ll.iterator(); i.hasNext(); ) {
            var woord = i.next();
            System.out.println(woord);
        }
        System.out.println("------------");
        ll.stream().forEach(System.out::println);
    }
}
