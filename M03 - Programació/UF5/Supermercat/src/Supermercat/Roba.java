package Supermercat;

import java.text.NumberFormat;
import java.util.Locale;

public class Roba extends Producte{
    String color;
    char talla;

    //CONSTRUCTOR
    public Roba(String nom, int preu, String color, char talla) {
        super(nom, preu, 21);
        this.color = color;
        if(!tallaOK(talla)) throw new Error("La talla ha de ser S, M o L.");
        this.talla = talla;
    }

    //GETTER
    public String getInfo(){
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance(new Locale("es","ES"));
        String info = "Nom: " + nom + "\n";
        info += "Color: " + color + "\n";
        info += "Talla: " + talla + "\n";
        info +="PVP: " + formatoImporte.format(this.pvp());
        return info;
    }

    //METODES PRIVATS DE COMPROBACIO
    private boolean tallaOK(char t){
        if(t == 'S' || t == 'M' || t == 'L' ){
            return true;
        }else return false;
    }
}
