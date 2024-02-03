package be.vdab.hello.TakenEnumHfstk18;

public class Persoon {
    private String voornaam;
    private String familienaam;
    private Geslacht geslacht;

    public Persoon(String voornaam, String familienaam, Geslacht geslacht) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.geslacht = geslacht;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setFamilienaam(String familienaam) {
        this.familienaam = familienaam;
    }



    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }



    @Override
    public String toString() {
        return "Persoon{" +
                "voornaam='" + voornaam + '\'' +
                ", familienaam='" + familienaam + '\'' +
                ", geslacht='" + geslacht + '\'' +
                '}';
    }
}
