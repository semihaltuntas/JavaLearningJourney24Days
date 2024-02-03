package be.vdab.Winkel12;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

public class Catalogus {

    private final Set<Product> producten = new LinkedHashSet<>();

    public Catalogus() {
        producten.add(new Product("1 kg appelen", BigDecimal.valueOf(1.34)));
        producten.add(new Product("1 kg peren", BigDecimal.valueOf(1.56)));
        producten.add(new Product("1 kg citroenen", BigDecimal.valueOf(0.64)));
        producten.add(new Product("1 kg aardbein", BigDecimal.valueOf(2.85)));
        producten.add(new Product("1 kg mandareinen", BigDecimal.valueOf(1.60)));
        producten.add(new Product("1 kg noten", BigDecimal.valueOf(2.35)));
        producten.add(new Product("1 kg kastanjes", BigDecimal.valueOf(3.15)));
        producten.add(new Product("1 kg rozijnen", BigDecimal.valueOf(1.90)));
    }


    public Set<Product> getProducten() {
        return producten;
    }

    @Override
    public String toString() {
        return producten.toString();
    }
}
