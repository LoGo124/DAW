package Exercicis;

/**
 * Maritim
 */
public class Maritim extends Transport {
    private static int maritimCount;
    private float profunditat;

    public Maritim(String marca, String model, Float kmHora, boolean motoritzat, Float profunditat) {
        super(marca, model, maritimCount, motoritzat);
        try {
            this.profunditat = profunditat;
            maritimCount++;
        } catch (Exception e) {
            System.out.println("No compleix les especificacons per ser un Transport Maritim degut al seguent error:\n"+e);
        }
        
    }

    @Override
    public String toString() {
        return super.toString() + "\n\nCom a Transport maritim...\n\nProfunditat: " + this.profunditat;
    }

    public static int getMaritimCount() {
        return maritimCount;
    }
}