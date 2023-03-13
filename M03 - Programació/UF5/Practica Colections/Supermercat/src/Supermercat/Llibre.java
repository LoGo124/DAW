package Supermercat;

import java.text.NumberFormat;
import java.util.Locale;

public class Llibre extends Producte{
    boolean tapaDura;

    //CONSTRUCTOR
    public Llibre(String nom, int preu, boolean tapaDura) {
        super(nom, preu, 4);
        this.tapaDura = tapaDura;
    }

    //GETTER
    public String getInfo(){
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance(new Locale("es","ES"));
        String info = "Nom: " + nom + "\n";
        info +="PVP: " + formatoImporte.format(this.pvp());
        return info;
    }


}
