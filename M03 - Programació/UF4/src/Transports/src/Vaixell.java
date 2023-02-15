/**
 * Vaixell
 */
public class Vaixell extends Maritim {
    private static int vaixellCount;
    
    public Vaixell(String marca, String model, Float kmHora, boolean motoritzat, Float profunditat) {
        super(marca, model, kmHora, motoritzat, profunditat);
        try {
            vaixellCount++; 
            
        } catch (Exception e) {
            System.out.println("No compleix les especificacons per ser un Vaixell degut al seguent error:\n"+e);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nCom a Vaixei...\n\n";
    }
    public static int getVaixellCount() {
        return vaixellCount;
    }
}