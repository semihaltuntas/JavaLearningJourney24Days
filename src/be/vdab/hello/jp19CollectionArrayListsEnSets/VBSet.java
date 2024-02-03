package be.vdab.hello.jp19CollectionArrayListsEnSets;

import java.util.HashSet;

public class VBSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet<String>();
        hs.add("fiets");
        hs.add("even");
        hs.add("dak");
        hs.add("citroen");
        hs.add("boom");
        hs.add("aap");
        hs.add("dak");
        hs.add(null);
        hs.add("dak");

        System.out.println("Voorbeeld van een HashSet ;");
        for(var woord :hs){
//            System.out.println(woord + "\t" + woord.hashCode());
            System.out.println(woord);
        }
//        for (var woord : hs) {
//            if (woord != null) {
//                System.out.println(woord + "\t" + woord.hashCode());
//            } else {
//                System.out.println("null");
//            }
//        }
    }
}
