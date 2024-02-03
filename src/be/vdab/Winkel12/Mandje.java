package be.vdab.Winkel12;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mandje {
    private final Map<Product, Integer> mandje = new LinkedHashMap<>();

    public Map<Product, Integer> getMaandje() {
        return mandje;
    }

    public void add(Product product, int aantal) {
        if (product == null) {
            throw new NullPointerException("Product moet ingevuld worden!");
        }
        if (aantal <= 0) {
            throw new IllegalArgumentException("aantal moet positief getal zijn");
        }
        if (mandje.containsKey(product)) {
            int oudeAantal = mandje.get(product);
            mandje.put(product, oudeAantal + aantal);
        } else {
            mandje.put(product, aantal);
        }
    }
    public void remove(Product product){
        if (product == null){
            throw new NullPointerException("Product moet ingevuld worden!");
        }
        if (!mandje.containsKey(product)){
            throw new IllegalArgumentException("Er moet een artikel in uw mandje zitten");
        }
        mandje.remove(product);
    }
    public void clear(){
        mandje.clear();
    }

    public BigDecimal getTotalePrijs(){
        BigDecimal totale = BigDecimal.ZERO;
        for (var entry : mandje.entrySet()){
//            System.out.println("entry :"+entry);
            totale = totale.add(entry.getKey().getPrijs().
                    multiply(BigDecimal.valueOf(entry.getValue())));
        }
        return totale;
    }

    @Override
    public String toString() {
        return mandje.toString();
    }
}
