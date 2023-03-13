public class CotxeCombustio extends Cotxe implements Autonomia{
    private float capacitatDiposit;
    private float consum100;

    public CotxeCombustio(String matricula, String model, int preu, float capacitatDiposit, float consum100){
        super(matricula, model, preu);
        this.capacitatDiposit = capacitatDiposit;
        this.consum100 = consum100;
    }
    // GETTERS
    @java.lang.Override
    public String getInfo() {
        return "\nMatricula: " + getMatricula() +
                "\nPreu: " + (Integer.toString(getPreu())) + " €" +
                "\nCapacitat: "+(Float.toString(capacitatDiposit))+" l" +
                "\nConsum: "+(Float.toString(consum100))+" l/100Km" +
                "\nAutonomia: "+(Integer.toString(getAutonomia()))+" Km";
    }
    // SETTERS


    public void setCapacitatDiposit(int capacitatDiposit) {
        this.capacitatDiposit = capacitatDiposit;
    }

    public void setConsum100(float consum100) {
        this.consum100 = consum100;
    }

    @java.lang.Override
    public int getAutonomia() {
        return ((int)(capacitatDiposit / consum100) * 100);
    }

    // COMPARADORS
    @java.lang.Override
    public int compareTo(Cotxe c) {
        return 0;
    }
}
