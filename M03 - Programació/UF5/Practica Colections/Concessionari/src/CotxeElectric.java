public class CotxeElectric extends Cotxe implements Autonomia{
    private float capacitatBateria;
    public CotxeElectric(String matricula, String model, int preu,float capacitatBateria){
        super(matricula, model, preu);
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

    //SETTERS

    public void setCapacitatBateria(float capacitatBateria) {
        this.capacitatBateria = capacitatBateria;
    }


    // COMPARADORS

    @java.lang.Override
    public int compareTo(Cotxe c) {
        return 0;
    }
}
