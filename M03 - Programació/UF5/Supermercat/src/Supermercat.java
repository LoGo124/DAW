import java.util.ArrayList;

package Supermercat;

public class Supermercat {

    static Producte[] productes = new Producte[10];


    public static void main(String[] args){
        Producte cocaCola = new Aliment("Coca-Cola",2,10,true);
        Producte pan = new Aliment("Pan",1,20,false);
        Producte camiseta = new Roba("camiseta", 5,"rojo",'L');
        Producte libro = new Llibre("Cosmos", 10, true);
        Producte galletas = new Aliment("Dinosaurios", 3, 3,false);
        Producte pantalon = new Roba("baquero", 7,"azúl",'M');

        afegirProducte(cocaCola);
        afegirProducte(pan);
        afegirProducte(camiseta);
        afegirProducte(libro);
        afegirProducte(galletas);
        afegirProducte(pantalon);

        productes = eliminarProducte("Pan");


        mostrarLlista(filtrarProductes("Roba"));
        mostrarLlista(filtrarProductes("Aliment"));
        mostrarLlista(filtrarProductes("Llibre"));

        mostrarLlista(productes);



    }

    static void afegirProducte(Producte p){
        for(int i = 0; i < productes.length; i++){
            if(productes[i] == null){
                productes[i] = p;
                break;
            }
        }

    }

    static Producte[] eliminarProducte(String n){
        Producte[] array = new Producte[10];
        int contador = 0;

        for(int i = 0; i < productes.length; i++){
            if(productes[i] != null){
                if(productes[i].getNom().contains(n)){
                    continue;
                }else {
                    array[contador] = productes[i];
                    contador++;
                }
            }

        }

        return array;
    }


    static Producte[] filtrarProductes(String tipus){
        Producte[] array = new Producte[10];
        int contador = 0;

        for(int i = 0; i < productes.length; i++){
            if(productes[i] != null){
                if(productes[i].getClass().getSimpleName().contains(tipus)){
                    array[contador] = productes[i];
                    contador++;
                }else continue;
            }

        }

        return array;
    }

    static void mostrarLlista(Producte[] l){
            for(int i = 0; i < l.length; i++){
                if(l[i] != null){
                    System.out.println(l[i].getInfo());
                    System.out.println();
                }else if(l[i] == null) break;
            }
    }

}
