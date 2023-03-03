abstract public class Cotxe{
    private String matricula;
    private int preu;
    public Cotxe(String matricula, int preu){
        this.matricula = matricula;
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

    public int getPreu() {
        return preu;
    }

    // COMPROBADORS
    public boolean preuOK(int preu){
        if (preu > 50000 || preu <5000){
            return false;
        }
        return true;
    }
}
