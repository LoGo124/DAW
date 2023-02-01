/**
 * crear una funcio nova sense param d'entrada però amb retorn
 * marcar les tasques pendents amb l'etiqueta que toqui
 * a la capçalera dels fitxers java: posar versió, autor i data
 * a cadascuna de les funcions: param, return i descripcio
 */

package com.company;

import java.util.Scanner;
import java.lang.Math;

/**
 * The type Menu: La clase pel menu.
 * @custom.data 22/12/2022
 * @version V1.0
 * @author IGNUser
 */
public class Menu {
    private Scanner in = new Scanner(System.in);
    private int opcio;
    private int [] vector = new int[10];
    private int [][] matriu = new int[10][10];

    /**
     * Menu principal: Bucle + Switch per mostrar el menu principal
     * @custom.data 22/12/2022
     * @version V1.0
     * @author IGNUser
     */
    public void menuPrincipal() {
        do {
            System.out.println("1. Crear un vector");
            System.out.println("2. Parells i Senars");
            System.out.println("3. Trobar un número parell");
            System.out.println("4. Mostrar la suma de tots els parells");
            System.out.println("5. Mostrar contingut");
            System.out.println("0. Acabar");
            System.out.print("Entra una opció(0-4): ");
            opcio = in.nextInt();
            in.nextLine();

            switch (opcio) {
                case 1:
                    //crear un vector
                    System.out.print("Entra la llargada del vector: ");
                    int n = in.nextInt();
                    crearVector(vector,n);
                    break;
                case 2:
                    //comprovar si hi ha més parells o senars dins d'una matriu
                    parellsoSenars(matriu);

                    break;
                case 3:
                    //cercar números parells dins d'un vector
                    if (hihaParells(vector)) {
                        System.out.println("s'ha trobat números parells al vector");
                        }
                    else System.out.println("No s'ha trobat números parells!!!");

                    break;
                case 4:
                    //cercar números parells dins d'un vector
                    if (hihaParells(vector)) {
                        sumaParells(vector);
                    }
                    else System.out.println("No s'ha trobat números parells!!!");

                    break;
                case 5:
                    //mostrar el contingut del vector
                    mostrarContingut(vector);
                    break;
                case 0:
                    System.out.println("Gràcies. Fins la propera!");
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 4");

            }
        }while(opcio != 0);
    }


    /**
     * Crear vector: Rep un Vector i l'omple amb el numero de valors aleatoris escollit per parametres.
     *
     * @param vector Vector que vols omplir de números.
     * @param n      El numero de numeros que vols guardar a dins.
     * @version V1.0
     * @author IGNUser
     */
    public static void crearVector(int []vector,int n){
        for (int i = 0; i < n; i++) { //omplim vector
            vector[i] = (int)Math.floor(Math.random()*10);
            System.out.print(vector[i]);
        }
    }

    /**
     * Parellso senars: Fa un recompte de numeros parells i senars i retorna el que tingui mes.
     *
     * @param matriu the matriu
     * @custom.data 22/12/2022
     * @version V1.0
     * @author IGNUser
     */
    public static void parellsoSenars(int [][]matriu){
        //ToDo: aquesta funció ha de retornar el total de números parells o senars segons qui guanyi
        int parell=0,senar=0;

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu.length; j++){
                matriu[i][j] = (int)Math.floor(Math.random()*10);
                if (matriu[i][j]% 2 == 0) {
                    parell = parell + 1;
                } else {
                    senar = senar + 1;
                }
            }
        }
        if (parell > senar){
            System.out.println("hi ha més parells que senars");
        }
        else if (senar > parell){
            System.out.println("hi ha més senars que parells");
        }
        else System.out.println("empat!");
    }

    /**
     * Hiha parells boolean: En cas de trobar un numero parell en el parametre, printa per pantalla "hi ha almenys un numero parell"
     * en cas contrari "no s'ha trobat cap numero parell" y finalment retorna true en culsevol dels casos.
     *
     * @param vector El vector en el que buscara els numeros parells
     * @return the boolean
     * @custom.data 22/12/2022
     * @version V1.0
     * @author IGNUser
     */
    public static boolean hihaParells(int [] vector){
        int i=0;
        while ((vector[i]%2 != 0) && (i <= vector.length)){  //v.length ens diu la longitud del vector
            i=i+1;
        }
        if (i != vector.length){
            System.out.println("hi ha almenys un número parell");
        }
        else System.out.println("no s'ha trobat cap número parell");
        return true;
    }

    /**
     * Mostrar contingut: Mostra el contingut de l'array de numeros enters que li pasis.
     *
     * @param vector Li has de pasar una array de numeros enters (vector)
     * @custom.data 22/12/2022
     * @version V1.0
     * @author IGNUser
     */
    public static void mostrarContingut(int [] vector){
        //PENDENT: aquesta funció està condicionada a l'execució d'alguna  de les funcions anteriors
        int i=0;
        while(vector[i]!='\0'){
            System.out.print(vector[i]);
            i++;
        }
    }

    /**
     * Parellso senars: Mostra la suma dels numeros parells.
     *
     * @param vector the vector
     * @custom.data 22/12/2022
     * @version V0.98
     * @author IGNUser
     */
    public static void sumaParells(int [] vector){
        //PENDENT: aquesta funció necesita excluir els casos en que el valor a sumar sugui 0.
        int res = 0;
        for (int n: vector) {
            if (n % 2 == 0 ) {
                System.out.println(res + " + " + n + " = " + (res + n));
                res += n;
            }
        }
    }
}
