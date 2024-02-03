package be.vdab.hello.TakenVoertuigenInheritance10;

public class Vrachtwagen extends Voertuig implements Vervuiler {

    private float maxLoading = 10000.0F;

    public Vrachtwagen(){
    };

    public Vrachtwagen(String polishouder, float kostPrijs, int pk,
                       float gemVerbruik, String nummerPlaat, float maxLoading) {
        super(polishouder, kostPrijs, pk, gemVerbruik, nummerPlaat);
        setMaxLoading(maxLoading);
    }

    public float getMaxLoading() {
        return maxLoading;
    }

    public final void setMaxLoading(float maxLoading) {
        if (maxLoading > 0.0F) {
            this.maxLoading = maxLoading;
        }
    }

    @Override
    public String toString() {
        return super.toString() +" ,"+ maxLoading;
    }

    @Override
    public void toon() {
        System.out.println("/n VRACHTWAGEN");
        super.toon();
        System.out.println("max.lading :" + maxLoading);
    }

    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / (maxLoading / 1000.0F);
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 20.0F;
    }


}
