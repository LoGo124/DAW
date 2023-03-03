package Supermercat;

import java.text.NumberFormat;
import java.util.Locale;


public class Aliment extends Producte{

    int calories;
    boolean beguda;

    //CONSTRUCTOR
    public Aliment(String nom, int preu, int calories, boolean beguda) {
        super(nom, preu,10);
        if(!caloriesOK(calories)) throw new Error("Les calories han de ser entre 0 i 1000.");
        this.calories = calories;
        this.beguda = beguda;
        if(beguda == true) iva = 21;
    }

    //GETTER
    public String getInfo(){
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance(new Locale("es","ES"));
        String info = "Nom: " + nom + "\n";
        info += "Calories: " + calories + "\n";
        info +="PVP: " + formatoImporte.format(this.pvp());
        return info;
    }

    //METODES PRIVATS DE COMPROBACIO
    private boolean caloriesOK(int c){
        if(c > 0 && c < 1000){
            return true;
        }else return false;
    }

}
