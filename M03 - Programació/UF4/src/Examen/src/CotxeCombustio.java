public class CotxeCombustio extends Cotxe implements Autonomia, Comparable{
    private int capacitatDiposit;
    private float consum100;

    public CotxeCombustio(String matricula, int preu, int capacitatDiposit, float consum100){
        super(matricula, preu);
        this.capacitatDiposit = capacitatDiposit;
        this.consum100 = consum100;
    }
    // GETTERS
    @java.lang.Override
    public String getInfo() {
        return "\nMatricula: " + getMatricula() +
                "\nPreu: " + (Integer.toString(getPreu())) + " €" +
                "\nCapacitat: "+(Integer.toString(capacitatDiposit))+" l" +
                "\nConsum: "+(Float.toString(consum100))+" l/100Km" +
                "\nAutonomia: "+(Integer.toString(getAutonomia()))+" Km";
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
