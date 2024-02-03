package be.vdab.hello.voorbelden14;

public class Waarnemer {
    private int aantalWaarnemingen;
    private double totaleTemperatuur;
    private int minumumTemperatuur = Integer.MAX_VALUE; //27554544
    private int maximumTemperatuur = Integer.MIN_VALUE; //-2756565

    public int getMaxTemp() {
        return aantalWaarnemingen > 0 ? maximumTemperatuur : 0;
    }

    public int getMinTemp() {
        return aantalWaarnemingen > 0 ? minumumTemperatuur : 0;
    }

    public int getAantalWaarnemingen() {
        return aantalWaarnemingen;
    }

    public double getGemTemp() {
        return aantalWaarnemingen > 0 ? totaleTemperatuur / aantalWaarnemingen : 0;
    }

    public void registeer(int temp) {
        totaleTemperatuur += temp;
        aantalWaarnemingen++;
        if (temp > maximumTemperatuur) {     //45 > -2788466544
            maximumTemperatuur = temp;
        }
        if (temp < minumumTemperatuur) {    //45 < 2788466544
            minumumTemperatuur = temp;
        }
    }


}
