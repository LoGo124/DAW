package Supermercat;

public class Producte implements Comparable<Producte>{
    //ATRIBUTS
    String nom;
    float preu;
    int iva;

    //CONSTRUCTOR
    public Producte(String nom, int preu, int iva) {
        this.nom = nom;
        if(!preuOK(preu)) throw new Error("El preu no pot ser inferior a 1.");
        this.preu = preu;
        this.iva = iva;
    }

    //GETTERS
    public String getNom() {
        return nom;
    }

    public String getInfo(){
        String info = "";
        info += "Nom: " + getNom() + "\n";
        return info;
    }

    public float pvp(){
        return ((preu * iva) / 100) + preu;
    }

    //METODES PRIVATS PER COMPROBAR
    private boolean preuOK(float preu){
        if(preu < 1) return false;
        else return true;
    }

    //COMPARADOR
    public int compareTo(Producte o) {
        if(this.pvp() < o.pvp()) return -1;
        else if(this.pvp() > o.pvp()) return 1;
        else return 0;
    }

    public static int compareTo(Producte a, Producte b) {
        return a.compareTo(b);
    }
}
