package be.vdab.verwarming;

import be.vdab.util.Vervuiler;

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
