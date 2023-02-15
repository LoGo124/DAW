package Exercicis;

/**
 * Terrestre
 */
public class Terrestre extends Transport {
    private static int terrestreCount;
    private int rodes;
    
    public Terrestre(String marca, String model, float kmHora, boolean motoritzat, int rodes) {
        super(marca, model, kmHora, motoritzat);
        try {
            this.rodes = rodes;
            terrestreCount++;
            
        } catch (Exception e) {
            System.out.println("No compleix les especificacons per ser un Terrestre degut al seguent error:\n"+e);
        }

    }
    @Override
    public String toString() {
        return super.toString() + "\n\nCom a transport terrestre...\n\nNumero de rodes: " + this.rodes;
    }

    public static int getTotalCount() {
        return terrestreCount;
    }
}
