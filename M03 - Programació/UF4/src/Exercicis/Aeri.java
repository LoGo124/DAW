package Exercicis;

/**
 * Aeri
 */
public class Aeri extends Transport {
    private static Integer aeriCount;
    public int alturaMax;
    public boolean cabianPresuritzada;
    
    public Aeri(String marca, String model, Float kmHora, boolean motoritzat, Integer alturaMax, Boolean cabianPresuritzada) {
        super(marca, model, kmHora, motoritzat);
        try {
            this.alturaMax = alturaMax;
            this.cabianPresuritzada = cabianPresuritzada;
            aeriCount++;
        } catch (Exception e) {
            System.out.println("No compleix les especificacons per ser un Aeri degut al seguent error:\n"+e);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nCom a transport aeri...\n\nLa ultura maxima de vol es: " + alturaMax + "\nCabina es presurizada: " + cabianPresuritzada;
    }

    public static int getAeriCount() {
        return aeriCount;
    }
}