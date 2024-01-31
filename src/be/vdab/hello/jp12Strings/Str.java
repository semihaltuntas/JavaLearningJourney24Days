package be.vdab.hello.jp12Strings;

public class Str {
    public static void main(String[] args) {
        var naam = new StringBuilder("Eddy");
        naam.append(" ");
        naam.append("Wally");
        naam.append(" is de nr 1");
        System.out.println("append method :" + naam);
        naam.insert(0, "De grote ");
        System.out.println("insert method :" + naam);
        naam.delete(0, 9);
        System.out.println("delete method :" + naam);
        System.out.println(naam.length());

        //new StringBuilder (a).append(b).append(c).toString() voor meerdere Strings gebruiken

        naam = new StringBuilder("De_Ronde_van_Vlaanderen");

        for (int i = 0; i < naam.length(); i++) {
            if (naam.charAt(i) == '_') {
                naam.setCharAt(i, ' ');
            }
        }
        System.out.println(naam);

        //tweede weg met replace() method

        naam.replace(0, naam.length(),
                naam.toString().replace('_', ' '));
        System.out.println(naam);
        // Text blocks

        var metTekstblokken = """
                { "Opleiding": "Java Ontwikkelaar"
                 "Cursus": "Java Programming Fundamentals" }
                  """;
        System.out.println(metTekstblokken);
    }
}
