package be.vdab.landTaken20;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import be.vdab.util.LandException;

public class Land {
    private String landCode, landNaam, hoofdstad;
    private BigInteger aantalInwoners;
    private BigDecimal oppervlakte;

    public Land(String landCode, String landNaam, String hoofdstad,
                BigInteger aantalInwoners, BigDecimal oppervlakte) throws LandException {
        setLandCode(landCode);
        setLandNaam(landNaam);
        setHoofdstad(hoofdstad);
        setAantalInwoners(aantalInwoners);
        setOppervlakte(oppervlakte);
    }

    public void setLandCode(String landCode) throws LandException {
        if (landCode != null || !landCode.isBlank()) {
            this.landCode = landCode;
        } else {
            throw new LandException(" Het moet ingevuld worden !");
        }
    }

    public void setLandNaam(String landNaam) throws LandException {
        if (landNaam != null || !landNaam.isBlank()) {
            this.landNaam = landNaam;
        } else {
            throw new LandException(" Het moet ingevuld worden !");
        }
    }

    public void setHoofdstad(String hoofdstad) throws LandException {

        if (hoofdstad != null || !hoofdstad.isBlank()) {
            this.hoofdstad = hoofdstad;
        } else {
            throw new LandException(" Het moet ingevuld worden !");
        }
    }

    public void setAantalInwoners(BigInteger aantalInwoners) throws LandException {
        if (aantalInwoners.compareTo(BigInteger.ZERO) > 0) {
            this.aantalInwoners = aantalInwoners;
        } else {
            throw new LandException(" Het moet groter dan 0 zijn !");
        }

    }

    public void setOppervlakte(BigDecimal oppervlakte) throws LandException {
        if (oppervlakte.compareTo(BigDecimal.ZERO) > 0) {
            this.oppervlakte = oppervlakte;
        } else {
            throw new LandException("Het moet groter dan 0 zijn !");
        }
    }

    public String getLandCode() {
        return landCode;
    }

    public String getLandNaam() {
        return landNaam;
    }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public BigInteger getAantalInwoners() {
        return aantalInwoners;
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public BigDecimal bevolkingsdichtheid() {
        return new BigDecimal(aantalInwoners).divide(oppervlakte, 2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Land{" +
                "landCode='" + landCode + '\'' +
                ", landNaam='" + landNaam + '\'' +
                ", hoofdstad='" + hoofdstad + '\'' +
                ", aantalInwoners=" + aantalInwoners +
                ", oppervlakte=" + oppervlakte +
                '}';
    }
}
