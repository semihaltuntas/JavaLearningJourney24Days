package be.vdab.hello.jp19CollectionArrayListsEnSets;

import java.util.TreeSet;

public class VBTreeSet {
    public static void main(String[] args) {

//        Volgorde van de sortering wordt bepaald door de compareTo() method van het type object dat bewaard wordt in de collectie. Deze methode is een methode van de interface Comparable.
//        Ze bepaalt de NATURAL ORDENİNG van de gegevens in de TreeSet!
//        Het null element is niet toegestaan.
//        Dubbels van objecten worden niet bewaard.

       TreeSet<String> ts = new TreeSet<String>();
        ts.add("fiets");
        ts.add("even");
        ts.add("dak");
        ts.add("citroen");
        ts.add("boom");
        ts.add("aap");
//        ts.add(null);
        ts.add("dak");
        System.out.println("Voorbeeld van een TreeSet :");
        for (String woord :ts){
            System.out.println(woord);
        }

        //Extra methods
        System.out.println("\n Extra methods : -----------");
        System.out.println("Eerste Element :"+ ts.first());
        System.out.println("Laatste Element :"+ ts.last());

    }



}
