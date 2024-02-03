package be.vdab.WinkelDENEME;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String omschrijving;
    private BigDecimal prijs;

    public Product(String omschrijving, BigDecimal prijs) {
      setOmschrijving(omschrijving);
      setPrijs(prijs);
    }

    public void setOmschrijving(String omschrijving) {
        if (omschrijving.isBlank()) {
            throw new IllegalArgumentException("het moet ingevuld worden");
        }
        this.omschrijving = omschrijving;
    }

    public void setPrijs(BigDecimal prijs) {
        if (prijs.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NumberFormatException("Prijs moet groter dan 0 zijn !");
        }
        this.prijs = prijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) {
            return false;
        }
        return omschrijving.equals(product.omschrijving);

    }

    @Override
    public int hashCode() {
        return Objects.hash(omschrijving, prijs);
    }

    @Override
    public String toString() {
        return omschrijving + " : " + prijs;
    }
}
