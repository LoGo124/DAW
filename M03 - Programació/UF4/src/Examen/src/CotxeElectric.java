public class CotxeElectric extends Cotxe implements Autonomia, Comparable{
    private float capacitatBateria;
    public CotxeElectric(String matricula, int preu,float capacitatBateria){
        super(matricula, preu);
        this.capacitatBateria = capacitatBateria;
    }

    // GETTERS
    @java.lang.Override
    public String getInfo() {
        return "\nMatricula: " + getMatricula() +
                "\nPreu: " + (Integer.toString( getPreu())) + " €" +
                "\nCapacitat: " + Float.toString(capacitatBateria) + " W" +
                "\nAutonomia: " + Integer.toString( getAutonomia()) + "Km";
    }

    @java.lang.Override
    public int getAutonomia() {
        return (int)(capacitatBateria*10);
    }

    // COMPARADORS

    @java.lang.Override
    public int compareTo(Cotxe c) {
        return 0;
    }
}
