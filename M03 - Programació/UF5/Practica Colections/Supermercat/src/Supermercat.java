import java.util.ArrayList;
import java.util.Scanner;

import Supermercat.*;

public class Supermercat {
    static ArrayList<Producte> productes = new ArrayList<Producte>();
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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

        System.out.println("Escoje el producto que quieres comparar: ");
        Producte p1 = productes.get(sc.nextInt());
        System.out.println("Escoje el producto con el que lo vas a comparar: ");
        Producte p2 = productes.get(sc.nextInt());

        int res = p1.compareTo(p2);
        if (res == 0){
            System.out.println("Tots dos valen el mateix.");
        } else if (res > 0) {
            System.out.println("El primer producte es mes car.");
        } else if (res < 0) {
            System.out.println("El segon producte es mes car.");
        }
    }

    static void afegirProducte(Producte p){
        productes.add(p);
    }

    static ArrayList<Producte> eliminarProducte(String n){
        ArrayList<Producte> tmpArray = new ArrayList<Producte>();

        for(int i = 0; i < productes.size(); i++){
            if(productes.get(i) != null){
                if(productes.get(i).getNom().contains(n)){
                    continue;
                }else {
                    tmpArray.add(productes.get(i));
                }
            }
        }
        return tmpArray;
    }

    static ArrayList<Producte> filtrarProductes(String tipus){
        ArrayList<Producte> tmpArray = new ArrayList<Producte>();

        for(int i = 0; i < productes.size(); i++){
            if(productes.get(i) != null){
                if(productes.get(i).getClass().getSimpleName().contains(tipus)){
                    tmpArray.add(productes.get(i));
                } else
                    continue;
            }
        }
        return tmpArray;
    }

    static void mostrarLlista(ArrayList<Producte> l){
            for(int i = 0; i < l.size(); i++){
                if(l.get(i) != null){
                    System.out.println(l.get(i).getInfo());
                    System.out.println();
                }else if(l.get(i) == null) break;
            }
    }
}
