package be.vdab.hello.jp11Debugging;

public class DebugVoorbeeld {
    public static void main(String[] args) {
//        var getal = Integer.parseInt("mahmut");
//        System.out.println(getal);

        String text = "Ik ben een java developer";
        System.out.println(plaatsAchterElkeStringEenPunt(text));

    }
    private static String plaatsAchterElkeStringEenPunt(String text){
        if(!text.endsWith(".")){
            text = text.concat("...........");
        }
        return text;
    }



}
