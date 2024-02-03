package be.vdab.hello.jp20InterfaceMapsHashMap;

import java.util.TreeMap;

public class VBTreeMap {
    public static void main(String[] args) {
        var landen = new TreeMap<String,String>();

        landen.put("B","Belgie");
        landen.put("NL","Nederland");
        landen.put("TR","Turkije");
        landen.put("F","Frankrijk");
        landen.put("L","Luxemburg");
        landen.put("D","Duitsland");


        var eenLand = landen.get("TR");
        System.out.println("eenLand met 'TR' = " + eenLand);

        var vorigLand = landen.put("F","Finland");
        System.out.println("Vorig Land met code F :"+ vorigLand);
        var eenLand1= landen.get("F");
        System.out.println("Land met code F = " + eenLand1);

        System.out.println("\n*** View van de Keys ***" );
        for (var eenLandcode : landen.keySet()){
            System.out.println(eenLandcode);
        }
        System.out.println("\n*** View van de Keys met bijhorende value-waarde ***");
        for (var eenLandcode : landen.keySet()){
            System.out.println(eenLandcode +" heeft als landnaam :"+landen.get(eenLandcode) );
        }
        System.out.println("\n*** View van de Values ***");
        for (var eenLandnaam : landen.values()){
            System.out.println("Values van landen :"+eenLandnaam);
        }
        if (landen.containsKey("D")){
            System.out.println("Get als de key gelijk aan 'D' :"+landen.get("D"));
        }
        System.out.println("\n *** View van de Keys en Values ***" );
        for (var eenLandnaam : landen.entrySet()){
            System.out.println("Key + Values van de landen = " + eenLandnaam);
        }

    }
}
