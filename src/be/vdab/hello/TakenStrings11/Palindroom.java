package be.vdab.hello.TakenStrings11;

public class Palindroom {
    public final StringBuilder orgTekst,revTekst;

    public Palindroom(String tekst){
        orgTekst = new StringBuilder(tekst.toLowerCase());
        revTekst = new StringBuilder(tekst.toLowerCase()).reverse();
    }
    public boolean isPalindroom(){
        return orgTekst.toString().equals(revTekst.toString());
    }

    public StringBuilder getOrgTekst() {
        return orgTekst;
    }

    public StringBuilder getRevTekst() {
        return revTekst;
    }
}
