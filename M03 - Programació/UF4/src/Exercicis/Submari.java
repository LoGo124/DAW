package Exercicis;

/**
 * Submari
 */
public class Submari extends Maritim {
    private static int submariCount;
    private float resistencia;
    private int mRangRadio;
    private int mRangPulsar;

    public Submari(String marca, String model, Float kmHora, boolean motoritzat, Float profunditat, float resistencia, int mRangRadio, int mRangPulsar){
        super(marca, model, kmHora, motoritzat, profunditat);
        try {
            this.resistencia = resistencia;
            this.mRangRadio = mRangRadio;
            this.mRangPulsar = mRangPulsar;
            submariCount++;
        } catch (Exception e) {
            System.out.println("No compleix les especificacons per ser un Submari degut al seguent error:\n"+e);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n\nCom a Submari...\n\nLa seva resistència es de: "+resistencia+"\nEl rang de la radio:"+mRangRadio+"m\nEl rang del radar: "+mRangPulsar;
    }

    public static int getSubmariCount() {
        return submariCount;
    }
}