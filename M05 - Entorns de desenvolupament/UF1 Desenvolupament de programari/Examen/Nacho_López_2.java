package com.company;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.round;

public class Main {
    Scanner in = new Scanner(System.in);
    
    /**
     * @description Fa la crida de funcions necesarias per simular una carrera fent us de valors aleatoris, amb dos corredors amb noms i numeros decidits per l'usuari.
     * 
     * @param args No l'utilitza per a res.
     * @return void: no retorna res.
     */
    public void main(String[] args) {

        final var RECORD_ACTUAL = (float) 6.77;
        int opcio;
        int dorsal_corredor1 = -1;
        int dorsal_corredor2 = -1;
        String nom_corredor1 = "";
        String nom_corredor2 = "";
        float temps_corredor1 = 0;
        float temps_corredor2 = 0;
        float temps_aleatori = 0;

        funcio0();

        do {
            opcio = in.nextInt();
            in.nextLine();
            switch (opcio) {
                case 1:
                        if (funcio1(nom_corredor1,dorsal_corredor1)){
                            System.out.println("El corredor te assignat un dorsal del 1er grup (0-50)");
                        }
                        else System.out.println("El corredor te assignat un dorsal del 2n grup (51-100)");
                    break;
                case 2:
                        funcio2(nom_corredor2,dorsal_corredor2);
                   break;
                case 3:
                        funcio3(temps_aleatori);
                    break;
                case 4:
                    int resposta;
                    System.out.println("Entra els 3 valors dels quals farem la mitja del temps");
                    String m = in.nextLine();
                    do {
                        System.out.println("A quin corredor assignem aquesta mitja (1 o 2)?");
                        resposta = in.nextInt();
                    } while ((resposta != 1) && (resposta != 2));
                    if (resposta == 1)
                        temps_corredor1 = funcio4(m);
                    else
                        temps_corredor2 = funcio4(m);
                    break;
                case 0:
                    System.out.println("Fins la propera!");
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 4");
            }
        } while (opcio != 0);

    }
    
    /**
     * @description Printa per pantalla el menu d'opcions.
     * 
     * @param  void: no demana cap parametre
     * @return void: No retorna res
     */
    public static void funcio0() {
        System.out.println("1. Opcio 1");
        System.out.println("2. Opcio 2");
        System.out.println("3. Opcio 3");
        System.out.println("4. Opcio 4");
        System.out.println("0. Acabar");
        System.out.print("Entra una opció (0-4):");
    }
    
    /**
     * @description demana un nom de corredor i un numero de dorsal, si el nom es buit el torna a demanar, despres el posa en majuscules,
     * si el numero de dorsal es un enter negatiu, el torna a demanar, si es un enter de 1 a 50 retorna true , i sino retorna false.
     * 
     * @param nom1 String: on es guardara el nom del 1r jugador
     * @param dorsal1 int: on es guardara el numero del primer jugador
     * @return bool: retorna true si el dorsal es un enter de 1 a 50
     */
    public boolean funcio1(String nom1, int dorsal1) {

        do {
            System.out.printf("Introdueix el nom del corredor 1 (no es pot deixar en blanc): ");
            nom1 = in.next();
        } while (nom1.equals(""));
        nom1 = nom1.toUpperCase();
        do {
            System.out.printf("introdueix un numero dorsal (0-100): ");
            dorsal1 = in.nextInt();
        } while (dorsal1 < 0);
        if (dorsal1 >0 && dorsal1 <= 50)
            return true;
        else
            return false;

    }

    /**
     * @description demana un nom de corredor i un numero de dorsal, si el nom es buit el torna a demanar, despres el posa en majuscules,
     * si el numero de dorsal es un enter negatiu, el torna a demanar,
     * 
     * @param nom2 String on es guardara el nom del 1r jugador
     * @param dorsal2 int on es guardara el numero del primer jugador
     * @return void: No retorna res
     */
    public void funcio2(String nom2, int dorsal2){
        do {
            System.out.printf("Introdueix el nom del corredor 2 (no es pot deixar en blanc): ");
            nom2 = in.next();
        } while (nom2.equals(""));
        nom2 = nom2.toUpperCase();

        do {
            System.out.printf("introdueix un numero dorsal (0-100): ");
            dorsal2 = in.nextInt();
        } while (dorsal2 < 0);
    }

    /**
     * @descripcio Genera la mitjana de 5 numeros aleatoris multiplicats per 99 i la guarda a la variable que li pasem.
     * 
     * @param temps float: on es guardara el temps del jugador 
     */
    public static void funcio3(float temps) {
        temps= 0;
        for (int i = 0; i < 5; i++) {
            temps += (float) (Math.random() * 99);
        }
        temps = temps / 5;
    }

    /**
     * @descripcio Rep una string per convertir a decimal (float), esborra els espais que te, el converteix, el divideix per 3 
     * y retorna el resultat en una nova variable de tupus float
     * 
     * @param mig String: la string que ha de convertir a float
     * @return mitja float: Retorna una variable nova amb el resultat
     */
    public static float funcio4(String mig){
        String t = "";
        int ndx;
        float mitja = 0;
        mig = mig.trim();

        ndx = mig.indexOf(" ");
        while (ndx > 0) {
            mitja += Float.parseFloat(mig.substring(0, ndx));
            mig = mig.substring(ndx).trim();
            ndx = mig.indexOf(" ");
        }
        mitja += Float.parseFloat(mig);
        mitja = mitja / 3;

        return mitja;
    }
}