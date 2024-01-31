package be.vdab.hello.jp12Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        java.lang.StringBuilder mahmut = new java.lang.StringBuilder("213123");



//        String bedrijf = "VDAB";
//        var scanner = new Scanner(System.in);
//        var invoerBedrijd = scanner.next();
//        System.out.println(invoerBedrijd.equals(bedrijf.toLowerCase()));
//        System.out.println(bedrijf == invoerBedrijd);

        System.out.println("-----------------");

//        Beschrijving
//          == and equals() niet gelijk aan elkaar. !!!
//         equals(): een hoofdlettergevoelige vergelijking; deze method geeft een boolean terug.
//         equalsIgnoreCase(): zoals voorgaande, maar dan niet hoofdlettergevoelig.

        var tekst1 = "abc";
        var tekst2 = "abc";
        var tekst3 = new String("abc");

        System.out.println("tekst 1 en 2 met == " + (tekst1 == tekst2));
        System.out.println("tekst 1 en 2 met equals = " + tekst1.equalsIgnoreCase(tekst2));
        System.out.println("tekst 1 en 2 met equals = " + tekst1.equals(tekst2));
        System.out.println("tekst 1 en 3 met == " + (tekst1 == tekst3));
        System.out.println("tekst 1 en 3 met equals = " + tekst1.equals(tekst3));
        System.out.println("compare 1 en 3 = " + tekst2.compareTo(tekst1));

        System.out.println("------replace--------");
        // replace()
        var woord = "hallo";
        woord = woord.replace('a', 'e');
        System.out.println(woord);

        // toLowerCase() && toUpperCase()
        System.out.println("------toLowerCase() && toUpperCase()--------");

        var woord1 = "HAllo";
        woord1 = woord1.toLowerCase();
        System.out.println(woord1);
        woord1 = woord1.toUpperCase();
        System.out.println(woord1);

        //trim() => Deze method trim() verwijdert ‘whitespaces’ (witruimtes) voor en achter de tekst van de string variabele.
        System.out.println("-------trim()-------");
        var woord2 = "     Hallo Mevrouw      ";
        woord2 = woord2.trim();
        System.out.println(woord2);

        //indent() => girintilemek ıcın kullanılır
        System.out.println("-------indent()-------");

        System.out.println(woord2.indent(1));
        System.out.println(woord2.indent(2));
        System.out.println(woord2.indent(3));

        //length(): geeft het aantal tekens van een string.
        //join(): strings samenvoegen doormiddel van een bepaalde afbakening.Ayırıcı ile birleştirir
        //isBlank(): geeft true indien de lengte (length()) van een string 0 is of indien de string alleen spaties bevat. In het andere geval is het resultaat false.
        //substring(): kopieert een deel van de string. hangi aralıgı ıstıyorsan alırsın
        //charAt(): retourneert het ‘character’ dat op een bepaalde positie staat.
        // indexOf() en lastIndexOf(): beide methods onderzoeken of een bepaalde substring onderdeel is van de string. De eerste method zoekt van voor naar achter, de laatste van achter naar voor.
        // split() : Aan de hand van de method split() kan je een String opsplitsen in verschillende stukjes

        System.out.println("-------Voorbeelden/length,join,isBlank,substring,chartAt,split-------");

        var woord3 ="Ik ben Java Developer Java";
        String[] stukjes = woord3.split(" ",3);

        System.out.println("length :"+ woord3.length());
        System.out.println("join :"+ woord3.join(" ",woord3));
        System.out.println("isBlank :"+ woord3.isBlank());
        System.out.println("substring :"+ woord3.substring(7,11));
        System.out.println("chatAt :"+ woord3.charAt(7));
        System.out.println("indexOf : "+ woord3.indexOf("Java"));
        System.out.println("lastIndexOf : "+ woord3.lastIndexOf("Java"));
        for (var stuk : stukjes ) {
            System.out.println("Split ' ' : " + stuk);
        }
      // Een String omzetten naar een primitive type
        System.out.println("-----ParseInt en ParseDouble() naar primitive type");
        var tekst = "5.0";
        var temperatuur = Double.parseDouble(tekst);
        System.out.println("naar Primitive type : " + temperatuur);

        tekst = "8";
        var geluksgetal = Integer.parseInt(tekst);
        System.out.println("naar Primitive type : "+ tekst);
        // Een primitive type omzetten naar een String
        System.out.println("----valueOf() naar String");

        var temperatuur1 = 5.0;
        var getal =7;
        var text = String.valueOf(temperatuur1);
        System.out.println("van double en Int naar String : "+ text +"/"+getal);


    }
}
