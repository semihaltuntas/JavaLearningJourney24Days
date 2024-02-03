package be.vdab.WinkelDENEME;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

public class Catalogus {
    private final Set<Product>producten =new LinkedHashSet<>();

    public Catalogus() {
        producten.add(new Product("Elma", BigDecimal.valueOf(2.15)));
        producten.add(new Product("Kiraz",BigDecimal.valueOf(3.15)));
        producten.add(new Product("Muz",BigDecimal.valueOf(4.50)));
        producten.add(new Product("Vişne", BigDecimal.valueOf(6.15)));
        producten.add(new Product("çilek",BigDecimal.valueOf(3.35)));
        producten.add(new Product("Üzüm",BigDecimal.valueOf(3.50)));
    }

    public Set<Product> getProducten() {
        return producten;
    }

    @Override
    public String toString() {
        return producten.toString();
    }
}
