/**
 * Tren
 */
public class Tren extends Terrestre{
    private static int countTren;
    public float ampladaRails;
    public int nConetorsElectric;

    public Tren(String marca, String model, float kmHora, boolean motoritzat, int rodes, float ampladaRails, int nConetorsElectric){
        super(marca, model, kmHora, motoritzat, rodes);
        this.ampladaRails = ampladaRails;
        this.nConetorsElectric = nConetorsElectric;
        countTren++;
        //try {
        //} catch (Exception e) {
        //    System.out.println("No compleix les especificacons per ser un Tren degut al seguent error:\n"+e);
        //}
        
    }

    @Override
    public String toString() {
        return super.toString() + "\n\nCom a Tren...\n\nL'amplada dels rails es: " + ampladaRails + "\nEl numero de connectors a l'electricitat es: " + nConetorsElectric;
    }

    public static int getCountTren() {
        return countTren;
    }
}
