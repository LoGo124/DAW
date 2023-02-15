public class Patinet extends Maritim {
    private static int countPatinet;
    private float mVela;

    public Patinet(String marca, String model, Float kmHora, boolean motoritzat, Float profunditat, float mVela){
        super(marca, model, kmHora, motoritzat, profunditat);
        try {
            this.mVela = mVela; 
            countPatinet++;
        } catch (Exception e) {
            System.out.println("No compleix les especificacons per ser un Patinet degut al seguent error:\n"+e);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n\nCom a Patinet...\n\nTotal de metres quadrats de la/s Vela/s: " + mVela;
    }

    public static int getCountPatinet() {
        return countPatinet;
    }
}
