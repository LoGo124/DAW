import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @description Es el main executa la funció menuPrincipal.
     */
    public static void main(String[] args) {
        menuPrincipal();
    }

    /**
     * Menu principal.
     *
     * @param void
     * @return void
     * @description Imprimeix per pantalla el menu i escolta la resposta de l'usuari per executar la funcio adecuada, en bucle, fins que la opcio sigui 0.
     */
    public static void menuPrincipal() {
        Scanner scan = new Scanner(System.in);
        int opcio;
        do {
            System.out.println("1. findVal");
            System.out.println("2. orderValues");
            System.out.println("3. printTaulaDeMultiplicar");
            System.out.println("4. funcio4");
            System.out.println("5. almostAlwaysTrue");
            System.out.println("6. findRepitedValues");
            System.out.println("7. rotateRandomString");
            System.out.println("8. intercalateIntArray");
            System.out.println("0. Acabar");
            System.out.print("Entra una opció(0-8): ");
            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    System.out.println("Introdueix quin valor vols buscar: ");
                    findVal(scan.nextInt(), genFourInts());
                    break;
                case 2:
                    System.out.println("Generem un vector aleatoriament i l'ordenem....");
                    orderValues(genFourInts());
                    break;
                case 3:
                    System.out.println("Introdueix el número de files");
                    int files = scan.nextInt();
                    System.out.println("Introdueix el número de columnes");
                    int columnes = scan.nextInt();
                    printTaulaDeMultiplicar(files, columnes);
                    break;
                case 4:
                    funcio4(genRandInts());
                    break;
                case 5:
                    System.out.println("Generem números aleatoris entre 100 i 10000 ....");
                    System.out.println();
                    if (almostAlwaysTrue())
                        System.out.println("Hi ha 10 o més números parells");
                    ;
                    break;
                case 6:
                    if (findRepitedValues()) {
                        System.out.println("Les llistes coincideixen");
                    } else
                        System.out.println("No s'han trobat coincidències");
                    break;
                case 7:
                    System.out.println("Entra el número d'elements de la llista");
                    int elems = scan.nextInt();
                    char[] lletres = rotateRandomString(elems);
                    System.out.println("Mostrem els elements de la llista desplaçats: ");
                    // pendent arreglar el rang de l'array
                    for (int i = 0; i <= elems; ++i) {
                        System.out.print(lletres[i] + " ");
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Mostrem una llista barrejada: ");
                    int[] llista = intercalateIntArray();
                    for (int i = 0; i < llista.length; ++i) {
                        System.out.print(llista[i] + " ");
                    }
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Fins la propera!");
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 8");
            }
        } while (opcio != 0);
    }

    /**
     * Gen four ints int [ ].
     *
     * @param void
     * @return static int[]
     * @description Genera una llista de 4 numeros enters aleatoris del 0 al 10
     */
    public static int[] genFourInts() {
        final int NUM_VALORS = 4;
        int[] valors = new int[NUM_VALORS];
        for (int i = 0; i < NUM_VALORS; ++i) {
            valors[i] = (int) (Math.random() * 10 + 1);
        }
        return valors;
    }

    /**
     * Find val.
     *
     * @param valor the valor
     * @param n     the n
     * @return void
     * @description Busca el valor indicat a l'array que li donem i imprimeix el resultat
     */
    public static void findVal(int valor, int[] n) {
        int min = 0;
        int max = n.length - 1;
        int mid = 0;
        System.out.println("Els valors de l'array son " + n); // pendent de mostrar el contingut de l'array correctament
        while (min <= max) {
            mid = (min + max) / 2;
            if (n[mid] < valor) {
                min = mid + 1;
            } else if (n[mid] > valor) {
                max = mid - 1;
            } else {
                break;
            }
        }

        if (n.length > 0 && n[mid] == valor) {
            System.out.println("S'ha trobat el valor en la posició " + mid);
        } else {
            System.out.println("NO s'ha trobat el valor en la llista");
        }
    }

    /**
     * Order values.
     *
     * @param n the n
     * @return void
     * @description Ordena els valors de l'array d'enters que pasis per parametre.
     */
    public static void orderValues(int[] n) {
        int t;
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    t = n[i];
                    n[i] = n[j];
                    n[j] = t;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    /**
     * Print taula de multiplicar.
     *
     * @param f the f
     * @param c the c
     * @return void
     * @description Mostra el resultat de les taules de multiplicar fent us d'una array multidimensional, amb els parametres, establim la longitud de la array principar y de la resta d'arrays
     */
    public static void printTaulaDeMultiplicar(int f, int c) {

        int[][] a = new int[f][c];
        for (int i = 0; i < f; ++i) {
            for (int j = 0; j < c; ++j) {
                a[i][j] = i * j;
            }
        }
        for (int i = 0; i < f; ++i) {
            for (int j = 0; j < c; ++j) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Funcio 4.
     *
     * @param a1 the a 1
     * @return void
     * @description
     */
    public static void funcio4(int[] a1) {
        for (int i = 0; i < a1.length; ++i) {
            a1[i] = (int) (Math.random() * 100);
            System.out.printf("%4d", a1[i]);
        }
        System.out.println();

        System.out.print("    ");
        for (int i = 1; i < a1.length; ++i) {
            System.out.printf("%4d", (a1[i - 1] + a1[i]));
        }
        System.out.println();

        for (int i = 0; i < a1.length / 2; ++i) {
            System.out.printf("%4d", (a1[i] + a1[a1.length - i - 1]));
        }
        System.out.println();
    }

    /**
     * Almost always true boolean.
     *
     * @param void
     * @return boolean boolean
     * @description Genera una llista de 1000 valors aleatoris i si troba mes de 9 parells retorna true, estadisticament 1%
     */
    public static boolean almostAlwaysTrue() {
        int n[] = new int[1000];
        int comptador = 0;
        boolean b = false;
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * (10000 - 100 + 1) + 100);
        }

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                ++comptador;
                if (comptador >= 10) {
                    b = true;
                    break;
                }
            }
        }
        return b;
    }

    /**
     * Find repited values boolean.
     *
     * @param void
     * @return boolean boolean
     * @description Genera dues llistes de 40 enters aleatoris i mira si hi han valors repetits a la mateixa posicio.
     */
    public static boolean findRepitedValues() {
        final int MIDA = 40;
        int[] a1 = new int[MIDA];
        int[] a2 = new int[MIDA];
        boolean iguals = true;

        System.out.println("Generem dues llistes aleatòriament ...");
        for (int i = 0; i < MIDA; ++i) {
            a1[i] = (int) (Math.random() * 10);
            System.out.printf("%2d", a1[i]);
        }
        System.out.println();
        for (int i = 0; i < MIDA; ++i) {
            a2[i] = (int) (Math.random() * 10);
            System.out.printf("%2d", a2[i]);
        }
        System.out.println();
        for (int i = 0; i < MIDA; ++i) {
            if (a1[i] != a2[i]) {
                iguals = false;
            }
        }
        return iguals;
    }

    /**
     * Rotate random string char [ ].
     *
     * @param j the j
     * @return char[] La frase resultant
     * @description Genera una cadena de caracters aleatoris i rota el valor dels caracters.
     */
    public static char[] rotateRandomString(int j) {
        char[] lletres = new char[j];
        char[] rotat = new char[j];
        int l = lletres.length - 1;
        char c;

        for (int i = 0; i <= l; ++i) {
            lletres[i] = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
            System.out.print(lletres[i] + " ");
        }
        System.out.println();

        c = lletres[l];

        for (int i = l; i > 0; i--) {
            lletres[i] = lletres[i - 1];
        }

        lletres[0] = c;
        return rotat;
    }

    /**
     * Intercalate int array int [ ].
     *
     * @param void
     * @return int[] int [ ]
     * @description Utilita dues arrays internes i genera una el doble de gran intercalant els valors.
     */
    public static int[] intercalateIntArray() {
        int[] n1 = { 1, 3, 5, 7, 9 };
        int[] n2 = { 10, 8, 6, 4, 2 };
        int[] n3 = new int[n1.length + n2.length];
        int j = 0;
        int l = n1.length > n2.length ? n1.length : n2.length;

        for (int i = 0; i < n1.length; ++i) {
            System.out.print(n1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n2.length; ++i) {
            System.out.print(n2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < l; ++i) {
            if (i < n1.length) {
                n3[j] = n1[i];
                ++j;
            }
            if (i < n2.length) {
                n3[j] = n2[i];
                ++j;
            }
        }
        return n3;
    }

    /**
     * Gen rand ints int [ ].
     *
     * @param void
     * @return int[] int [ ]
     * @description Genera dues llistes de 10 numeros aleatoris del 0 al 100 y suma cada valor amb el valor respectiu de  l'altra llista generant una llista de valors aleatoris del 0 al 200.
     */
    public static int[] genRandInts() {
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        int[] a3 = new int[10];

        for (int i = 0; i < a1.length; ++i) {
            a1[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < a1.length; ++i) {
            a2[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < a1.length; ++i) {
        }

        for (int i = 0; i < a1.length; ++i) {
            for (int j = 0; j < a2.length; ++j) {
                a3[i] = (a1[i] + a2[j]);
            }
        }
        return a3;
    }

    /**
     * Invertir arrays lletres.
     *
     * @param void
     * @return void
     * @description
     * @deprecated
     */
    public static void invertirArraysLletres() {
        char[] lletres = new char[10];
        int l = lletres.length - 1;
        char c;
        for (int i = 0; i <= l; ++i) {
            lletres[i] = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
        }

        for (int i = 0; i <= l; i++) {
            System.out.printf("%2s", lletres[i]);
        }
        System.out.println();

        for (int i = l; i >= 0; i--) {
            System.out.printf("%2s", lletres[i]);
        }
        System.out.println();

        for (int i = 0; i <= l / 2; i++) {
            c = lletres[i];
            lletres[i] = lletres[l - i];
            lletres[l - i] = c;
        }

        for (int i = 0; i <= l; i++) {
            System.out.printf("%2s", lletres[i]);
        }
        System.out.println();
    }

}