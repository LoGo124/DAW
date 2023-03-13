import java.util.*;

public class Concesionari {
    public static HashMap<String, Cotxe> cochesDisponibles = new HashMap<String, Cotxe>();
    public static ArrayList<Cotxe> cochesSeleccionados = new ArrayList<Cotxe>();
    /**
     *
     */
    public static void main(String[] args) {
        cochesDisponibles.put("1234-abc", new CotxeCombustio("1234-abc", "crw100", 5001, 100, 20));
        cochesDisponibles.put("2345-bcd", new CotxeCombustio("2345-bcd", "crm300", 6000, 200, 10));
        cochesDisponibles.put("3456-cde", new CotxeElectric("3456-cde", "e1040", 10000, 150));
        cochesDisponibles.put("4567-def", new CotxeElectric("4567-def", "e500", 9999, 250));

        HashMap<Integer, String> menu = new HashMap<Integer, String>();
        menu.put(1, "Mostrar seleccionats");
        menu.put(2, "Mostrar tots");
        menu.put(3, "Filtrar");
        menu.put(4, "Ordenar");
        menu.put(5, "Descartar Seleccionats");
        menu.put(6, "Afegir Seleccionats");
        menu.put(7, "Esborrar cotxe");
        menu.put(8, "Crear cotxe");
        menu.put(9, "Editar cotxe");
        menu.put(10, "Salir");

        int opcionSeleccionada;
        Scanner sc = new Scanner(System.in);

        do {
            opcionSeleccionada = mostrarMenu(menu);
            switch (opcionSeleccionada) {
                case 1:
                    mostrarSeleccionados();
                    sc.nextLine();
                    break;
                case 2:
                    mostrarTodos();
                    sc.nextLine();
                    break;
                case 3:
                    filtrar();
                    sc.nextLine();
                    break;
                case 4:
                    //ordenar();
                    sc.nextLine();
                    break;
                case 5:
                    descartar();
                    sc.nextLine();
                    break;
                case 6:
                    afegir();
                    sc.nextLine();
                    break;
                case 7:
                    esborrar();
                    sc.nextLine();
                    break;
                case 8:
                    crear();
                    sc.nextLine();
                    break;
                case 9:
                    editar();
                    sc.nextLine();
                    break;
                case 10:
                    System.out.println("Adiós!");
                    sc.nextLine();
                    break;
                default:
                    System.out.println("Opción inválida");
                    sc.nextLine();
                    break;
            }
        } while (opcionSeleccionada != menu.size());
    }

    public static int mostrarMenu(HashMap<Integer, String> menu) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Seleccione una opción:");
            for (int i = 1; i <= menu.size(); i++) {
                System.out.println(i + ". " + menu.get(i));
            }
            opcion = sc.nextInt();

            if (opcion >= 0 && opcion <= menu.size()) {
                System.out.println("Ha seleccionado la opción " + opcion);
            } else if (opcion == menu.size() + 1) {
                System.out.println("Adiós!");
            } else {
                System.out.println("Opción inválida");
            }
        } while (opcion < 1 || opcion > menu.size());

        return opcion;
    }

    public static void mostrarTodos() {
        Scanner sc = new Scanner(System.in);
        cochesDisponibles.entrySet().forEach(entry -> {
            Cotxe cotxe = entry.getValue();
            System.out.println(cotxe.getInfo());
            sc.nextLine();
        });
        System.out.println("No hi han mes.");
    }

    public static void mostrarSeleccionados() {
        Scanner sc = new Scanner(System.in);
        for (Cotxe cotxe : cochesSeleccionados){
            System.out.println(cotxe.getInfo());
            sc.nextLine();
        };
        System.out.println("No hi han mes.");
    }
    public static void filtrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tipo de motor (C/E):");
        String type = sc.nextLine();
        System.out.println(type);
        if (Objects.equals(type, "C")){
            for (Map.Entry<String, Cotxe> entry : cochesDisponibles.entrySet()) {
                String matricula = entry.getKey();
                Cotxe cotxe = entry.getValue();
                if (cotxe.getClass() == CotxeCombustio.class) {
                    System.out.println(cotxe.getInfo());
                    System.out.println("-----------------------------");
                }
            }
        } else if (Objects.equals(type, "E")) {
            for (Map.Entry<String, Cotxe> entry : cochesDisponibles.entrySet()) {
                String matricula = entry.getKey();
                Cotxe cotxe = entry.getValue();
                if (cotxe.getClass() == CotxeElectric.class) {
                    System.out.println(cotxe.getInfo());
                    System.out.println("-----------------------------");
                }
            }
        } else {
            System.out.println("No has introduit un valor correcte (C/E)");
        }

    }

    /**
    public static void ordenar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un criterio de ordenación:");
        System.out.println("1. Marca");
        System.out.println("2. Modelo");
        System.out.println("3. Precio");
        int opcion = sc.nextInt();

        HashMap<String, Cotxe> cochesOrdenados = new HashMap<String, Cotxe>();

        switch (opcion) {
            case 1:
                // Ordenar por marca
                Collections.sort(cochesOrdenados);
                break;
            case 2:
                // Ordenar por modelo
                cochesOrdenados.sort((entry1, entry2) -> entry1.getValue().getModelo().compareTo(entry2.getValue().getModelo()));
                break;
            case 3:
                // Ordenar por precio
                cochesOrdenados.sort((entry1, entry2) -> Double.compare(entry1.getValue().getPrecio(), entry2.getValue().getPrecio()));
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("Coches ordenados:");
        for (Map.Entry<String, Cotxe> entry : listaCotxes) {
            System.out.println("Matrícula: " + entry.getKey());
            System.out.println(entry.getValue().getInfo());
            System.out.println("-----------------------------");
        }
    }
*/
    public static void crear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la matrícula del coche:");
        String matricula = sc.nextLine();

        if (cochesDisponibles.containsKey(matricula)) {
            System.out.println("Ya existe un coche con esa matrícula.");
            return;
        }

        System.out.println("Introduzca el modelo:");
        String model = sc.nextLine();

        System.out.println("Introduzca el precio:");
        int preu = sc.nextInt();

        System.out.println("Introduzca el tipo de coche (C para combustión, E para eléctrico):");
        String tipo = sc.nextLine();

        if (tipo.equals("C")) {

            System.out.println("Introduzca la capacidad del depósito de combustible:");
            int capacidad = sc.nextInt();

            System.out.println("Introduzca el consumo medio de combustible:");
            float consumo = sc.nextFloat();

            cochesDisponibles.put(matricula, new CotxeCombustio(matricula, model, preu, capacidad, consumo));
            System.out.println("Coche añadido correctamente.");
        } else if (tipo.equals("E")) {
            System.out.println("Introduzca la capacidad de la batería:");
            int capacidad = sc.nextInt();
            cochesDisponibles.put(matricula, new CotxeElectric(matricula, model, preu, capacidad));
            System.out.println("Coche añadido correctamente.");
        } else {
            System.out.println("Tipo de coche no válido.");
        }
    }

    public static void esborrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la matrícula del coche a eliminar:");
        String matricula = sc.nextLine();

        if (cochesDisponibles.containsKey(matricula)) {
            cochesDisponibles.remove(matricula);
            System.out.println("Coche con matrícula " + matricula + " eliminado exitosamente.");
        } else {
            System.out.println("No se encontró ningún coche con la matrícula " + matricula + ".");
        }
    }

    public static void editar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la matrícula del coche a editar:");
        String matricula = sc.nextLine();

        if (cochesDisponibles.containsKey(matricula)) {
            Cotxe coche = cochesDisponibles.get(matricula);

            HashMap<Integer, String> menu = new HashMap<Integer, String>();
            if (coche instanceof CotxeCombustio) {
                menu.put(1, "Editar modelo");
                menu.put(2, "Editar precio");
                menu.put(3, "Editar capacidad");
                menu.put(4, "Editar consumo");
                menu.put(5, "Atras");
            } else if (coche instanceof CotxeElectric) {
                menu.put(1, "Editar modelo");
                menu.put(2, "Editar precio");
                menu.put(3, "Editar capacidad");
                menu.put(4, "Atras");
            }

            int opcionSeleccionada;
            do {
                opcionSeleccionada = mostrarMenu(menu);
                switch (opcionSeleccionada) {
                    case 1:
                        System.out.println("Introduce el nuevo modelo:");
                        String marca = sc.nextLine();
                        coche.setModel(marca);
                        System.out.println("Marca actualizada.");
                        break;
                    case 2:
                        System.out.println("Introduce el nuevo Precio:");
                        int precio = sc.nextInt();
                        coche.setPreu(precio);
                        System.out.println("Modelo actualizado.");
                        break;
                    case 3:
                        System.out.println("Introduce la nueva capacidad:");
                        int capacitat = sc.nextInt();
                        if (coche instanceof CotxeCombustio) {
                            ((CotxeCombustio) coche).setCapacitatDiposit(capacitat);
                        } else if (coche instanceof CotxeElectric) {
                            ((CotxeElectric) coche).setCapacitatBateria(capacitat);
                        }
                        System.out.println("Capacidad actualizada.");
                        break;
                    case 4:
                        if (coche instanceof CotxeElectric) {
                            System.out.println("Cambios guardados...");
                            cochesDisponibles.replace(matricula, coche);
                        } else if (coche instanceof CotxeCombustio) {
                            System.out.println("Introduce el nuevo consumo:");
                            int consum = sc.nextInt();
                            ((CotxeCombustio) coche).setConsum100(consum);
                            System.out.println("Autonomía actualizada.");
                        }
                        break;
                    case 5:
                        cochesDisponibles.replace(matricula, coche);
                        System.out.println("Cambios guardados...");
                        break;
                    case 6:
                        System.out.println("Saliendo del editor.");
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            } while (opcionSeleccionada != 6);
        }
    }
/**
            System.out.println("Introduzca el nuevo modelo del coche:");
            String modelo = sc.nextLine();
            coche.setModel(modelo);

            System.out.println("Introduzca el nuevo precio:");
            int preu = sc.nextInt();
            coche.setPreu(preu);

            System.out.println("Introduzca el tipo de coche si quiere editar (C para combustión, E para eléctrico):");
            String tipo = sc.nextLine();

            if (tipo.equals("C")) {
                System.out.println("Introduzca la capacidad del depósito de combustible:");
                int capacidad = sc.nextInt();
                System.out.println("Introduzca el consumo medio de combustible:");
                float consumo = sc.nextFloat();
                cochesDisponibles.put(matricula, new CotxeCombustio(matricula, preu, capacidad, consumo));
                System.out.println("Coche añadido correctamente.");
            } else if (tipo.equals("E")) {
                System.out.println("Introduzca la capacidad de la batería:");
                int capacidad = sc.nextInt();
                cochesDisponibles.put(matricula, new CotxeElectric(matricula, preu, capacidad));
                System.out.println("Coche añadido correctamente.");
            } else {
                System.out.println("Tipo de coche no válido.");
            }

            System.out.println("Introduzca la nueva potencia del coche:");
            int potencia = sc.nextInt();
            coche.setCapacitatDiposit(potencia);

            System.out.println("Introduzca el nuevo consumo del coche:");
            double consumo = sc.nextDouble();
            coche.setConsumo(consumo);

            System.out.println("Coche con matrícula " + matricula + " editado exitosamente.");
        } else {
            System.out.println("No se encontró ningún coche con la matrícula " + matricula + ".");
        }
    }
*/
    public static void afegir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la matrícula del coche que desea agregar:");
        String matricula = sc.nextLine();
        if (cochesDisponibles.containsKey(matricula)) {
            cochesSeleccionados.add(cochesDisponibles.get(matricula));
            System.out.println("El coche con matrícula " + matricula + " ha sido agregado a los seleccionados.");
        } else {
            System.out.println("El coche con matrícula " + matricula + " no existe en los disponibles.");
        }
    }

    public static void descartar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la matrícula del coche que desea descartar:");
        String matricula = sc.nextLine();
        for (Cotxe cotxe : cochesSeleccionados) {
            if (cotxe.getMatricula() == matricula) {
                cochesSeleccionados.remove(cotxe);
                System.out.println("El coche con matrícula " + matricula + " ha sido descartado de los seleccionados.");
                return;
            }
        }
        System.out.println("El coche con matrícula " + matricula + " no existe en los seleccionados.");
        return;
    }

}