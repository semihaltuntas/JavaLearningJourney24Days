package be.vdab.hello.jp23JavaDoc;

import be.vdab.hello.TakenEnumHfstk18.Geslacht;

import java.time.LocalDate;

/**
 * Deze klasse stelt een persoon voor.
 * Een persoon heeft een voornaam, achternaam, geboortedatum en een geslacht.
 *
 * @author Instructeur Java
 * @version 1.0
 */
public class Persoon {
    private String voornaam;
    private String familienaam;
    private Geslacht geslacht;

    /**
     * Deze constructor maakt een persoon aan met al zijn verplichte eigenschappen
     *
     * @param voornaam    De voornaam van de persoon
     * @param familienaam De achternaam van de persoon
     * @param geslacht    Het geslacht van de persoon
     */
    public Persoon(String voornaam, String familienaam, Geslacht geslacht) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.geslacht = geslacht;
    }


    /**
     * Het geslacht van deze persoon
     *
     * @see be.vdab.hello.TakenEnumHfstk18.Geslacht
     */

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    /**
     * Geeft de voornaam van de persoon terug
     * De persoon zijn voornaam kan meegegeven worden door gebruik te maken
     * van de constructor. * {@link be.vdab.hello.jp23JavaDoc.Persoon#Persoon(String, String, Geslacht)}
     * Als je nadien de voornaam wil wijzigen kan je gebruik maken van de setter
     * {@link be.vdab.hello.jp23JavaDoc.Persoon#setVoornaam(String)} *
     *
     * @return De voornaam van de persoon
     */

    public String getVoornaam() {
        return voornaam;

    }
}
