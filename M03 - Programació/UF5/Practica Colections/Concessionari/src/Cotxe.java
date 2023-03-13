import org.jetbrains.annotations.NotNull;

abstract public class Cotxe implements Comparable{
    private String matricula;
    private String model;
    private int preu;
    public Cotxe(String matricula, String model, int preu){
        this.matricula = matricula;
        this.model = model;
        if (preuOK(preu)){
            this.preu = preu;
        }
        else {
            //throw new exception("El preu està fora dels limits.");
        }
    }
    //GETERS
    abstract public String getInfo();

    public String getMatricula() {
        return matricula;
    }

    public String getModel() {
        return model;
    }

    public int getPreu() {
        return preu;
    }

    // SETTERS
    public void setModel(String model) {
        this.model = model;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    // COMPARADORS
    public int compareTo(Cotxe p){
        return (p.preu - this.preu);
    }


    // COMPROBADORS
    public boolean preuOK(int preu){
        if (preu > 50000 || preu <5000){
            return false;
        }
        return true;
    }
}
