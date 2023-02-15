/**
 * Cotxe
 */
public class Cotxe extends Terrestre{
    private static int countCotxe;
    public int portes;

    public Cotxe(String marca, String model, float kmHora, boolean motoritzat, int rodes, int portes) {
        super(marca, model, kmHora, motoritzat, rodes);
        try {
            this.portes = portes;
            countCotxe++;
        } catch (Exception e) {
            System.out.println("No compleix les especificacons per ser un Cotxe degut al seguent error:\n"+e);
        }
    }
    public static int getCountCotxe() {
        return countCotxe;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\nCom a Cotxe...\n\nNumero de portes: "+this.portes;
    }
}