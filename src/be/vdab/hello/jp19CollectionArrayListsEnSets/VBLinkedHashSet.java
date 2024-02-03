package be.vdab.hello.jp19CollectionArrayListsEnSets;


import java.util.LinkedHashSet;

public class VBLinkedHashSet {
    public static void main(String[] args) {
        var lhs = new LinkedHashSet<String>();
        lhs.add("fiets");
        lhs.add("even");
        lhs.add("dak");
        lhs.add("citroen");
        lhs.add("boom");
        lhs.add("aap");
        lhs.add(null);
        lhs.add("dak");

        System.out.println("Voorbeeld van een LinkedHashSet ;");
//        for(var woord :lhs){
//            System.out.println(woord + "\t" + woord.hashCode());
//            System.out.println(woord);
//        }
        for (var woord : lhs) {
            if (woord != null) {
                System.out.println(woord + "\t" + woord.hashCode());
            } else {
                System.out.println("null");
            }
        }
    }
}
