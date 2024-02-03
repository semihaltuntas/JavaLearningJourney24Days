package be.vdab.hello.Taken20CollectionsMapsBeginLetter;

import java.util.HashMap;

public class BeginLetter {
    private static final String[] woorden = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien"};

    public static void main(String[] args) {
        var hashMapAantal = new HashMap<Character, Integer>();

        for (var woord : woorden) {
            if (!hashMapAantal.containsKey(woord.charAt(0)))
                hashMapAantal.put(woord.charAt(0), 1);
            else {
                hashMapAantal.put(woord.charAt(0),hashMapAantal.get(woord.charAt(0)) + 1);
            }
        }

        System.out.println(hashMapAantal);
        System.out.println("Size :" + hashMapAantal.size());
        System.out.println("İs empty? :" + hashMapAantal.isEmpty());


        System.out.println("--Set van de keys--");
        for (var keys : hashMapAantal.keySet()) {
            System.out.println(keys);
        }

        System.out.println("--Set van de values--");
        for (var values : hashMapAantal.values()) {
            System.out.println(values);
        }


        System.out.println("--Set van de map entries--");
        for (var entries : hashMapAantal.entrySet()) {
            System.out.println(entries);
            System.out.println(" of anders " + entries.getKey() + " : " + entries.getValue());
        }
    }


}
