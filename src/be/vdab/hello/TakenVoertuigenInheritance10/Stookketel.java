package be.vdab.hello.TakenVoertuigenInheritance10;

public class Stookketel implements Vervuiler {

    public float coNorm;
    public Stookketel(){
    }
    public Stookketel(float coNorm){
        setCoNorm(coNorm);
    }

    public float getCoNorm() {
        return coNorm;
    }

    public void setCoNorm(float coNorm) {
        if (coNorm > 0.0)
        this.coNorm = coNorm;
    }

    @Override
    public double berekenVervuiling() {
        return coNorm *100;
    }
}
