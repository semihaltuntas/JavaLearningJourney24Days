package be.vdab.Main;


import be.vdab.landTaken20.Land;
import be.vdab.util.LandException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

public class MainLanden {
    public static void main(String[] args) {



        var landen = new ArrayList<Land>();

        try {
            landen.add(new Land("Bg", "Bulgarije", "Sofia",
                    BigInteger.valueOf(78000000L), BigDecimal.valueOf(111002.42)));

        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            landen.add(new Land("In", "India", "New Delhi",
                    BigInteger.valueOf(1060000000L), BigDecimal.valueOf(3336251.12)));
        } catch (LandException le) {
            System.out.println(le.getMessage());
        }
        try {
            landen.add(new Land("It", "Italië", "Rome",
                    BigInteger.valueOf(57840000L), BigDecimal.valueOf(301268.14)));
        } catch (LandException le) {
            System.out.println(le.getMessage());
        }
        try {
            landen.add(new Land("L", "Luxemburg", "Luxemburg",
                    BigInteger.valueOf(462690L), BigDecimal.valueOf(2586.27)));
        } catch (LandException le) {
            System.out.println(le.getMessage());
        }
        try {
            landen.add(new Land("N", "Noorwegen", "Oslo",
                    BigInteger.valueOf(4600000L), BigDecimal.valueOf(386958.22)));
        } catch (LandException le) {
            System.out.println(le.getMessage());
        }
        try {
            landen.add(new Land("B", "België", "Brussel",
                    BigInteger.valueOf(10400000L), BigDecimal.valueOf(30528.56)));
        } catch (LandException le) {
            System.out.println(le.getMessage());
        }
        try {
            landen.add(new Land("Si", "Singapore", "Singapore",
                    BigInteger.valueOf(4200000L), BigDecimal.valueOf(640.94)));
        } catch (LandException le) {
            System.out.println(le.getMessage());
        }
        try {
            landen.add(new Land("Us", "Verenigde Staten", "Washington DC",
                    BigInteger.valueOf(293000000L), BigDecimal.valueOf(9165487.63)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            landen.add(new Land("Ag", "Argentine", "Buenos Aires",
                    BigInteger.valueOf(38500000L), BigDecimal.valueOf(2825647.56)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            landen.add(new Land("Ey", "Egpyt", "Cairo",
                    BigInteger.valueOf(72000000L), BigDecimal.valueOf(997739.83)));
        } catch (LandException le) {
            System.out.println("10. Land : "+le.getMessage());
        }

  BigDecimal totaleBevolkingsdichtheid = BigDecimal.ZERO;
        for (var land :landen){
            BigDecimal dichtheid = land.bevolkingsdichtheid();
            System.out.println(land.getLandNaam()+ " -Bevolkingsdichtheid:"+dichtheid+"inw/km²");
            totaleBevolkingsdichtheid = totaleBevolkingsdichtheid.add(dichtheid);
        }

        System.out.println("---------------");

       BigDecimal gemiddelde = totaleBevolkingsdichtheid.divide(new BigDecimal(landen.size()),2,RoundingMode.UP);
        System.out.println("Gemiddelde bevolkingsdichtheid: " + gemiddelde + " inw/km²");

        Land dichtstbijGemiddelde = landen.get(5);
        BigDecimal kleinsteVerschil = gemiddelde.subtract(dichtstbijGemiddelde.bevolkingsdichtheid()).abs();
        System.out.println("dichtbey :"+dichtstbijGemiddelde.bevolkingsdichtheid());
        for (Land land : landen) {
            BigDecimal huidigVerschil = gemiddelde.subtract(land.bevolkingsdichtheid()).abs();
            if (huidigVerschil.compareTo(kleinsteVerschil) < 0) {
//                System.out.println(huidigVerschil.compareTo(kleinsteVerschil));
                kleinsteVerschil = huidigVerschil;
                dichtstbijGemiddelde = land;
            }
        }

        System.out.println("Land dichtst bij gemiddelde bevolkingsdichtheid: " + dichtstbijGemiddelde.getLandNaam());
    }
}