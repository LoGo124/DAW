package Exercicis2;
import java.time.LocalDate;

public class E1_Persona {
    private String nif;
    private String nom;
    private String dataNaixement;    

    public E1_Persona(String nif, String nom, String dataNaixement){
        this.nif = nif;
        this.nom = nom;
        this.dataNaixement = dataNaixement;
    }

    @Override
    public String toString() {
        return this.nif + ":" + this.nom + ":" + this.dataNaixement;
    }

    public static int getEdat(String data) {
        LocalDate now = LocalDate.now();
        
        int any = now.getYear();
        int mes = now.getMonthValue();
        int dia = now.getDayOfMonth();

        String[] dadesNaixement = data.split("-");
        int diaN = Integer.parseInt(dadesNaixement[0]);
        int mesN = Integer.parseInt(dadesNaixement[1]);
        int anyN = Integer.parseInt(dadesNaixement[2]);

        int anys = any - anyN;
        if (mes < mesN || (mes == mesN && dia < diaN)) --anys;
        return anys;
        
    }
//    public String checkNif(String nif){
//        n
//    }
//
//    public String checkNom(String nom){
//
//    }
//
//    public String checkDataNaixement(String dataNaixement){
//
//    }

}
