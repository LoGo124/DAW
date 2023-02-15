package Exercicis;

public class tester {
    /*
    public static void main(String[] args) {
        E1_Persona persona1 = new E1_Persona("39417387X", "Nacho",  "23-02-2002");
        
        String info = persona1.toString();
        int edat = E1_Persona.getEdat(persona1.toString().split(":")[2]);
        
        System.out.println(info);
        System.out.println(String.valueOf(edat));
    }
    */
    public static void main(String[] args) {
        Transport[] transports = {new Cotxe("Mercedes", "M220", 220, true,4,4), new Tren("BritRail", "b70 large", 120.0f, true,48,1.5f,24), new Patinet("SeaRider", "sr550h", 50f, false, 0.1f, 2*2f), new Submari("Subway", "ss980", 40.5f, true,1500f, 9.5f, 5000,2000), new Vaixell("SeaRider", "br1040t", 62f, true, 5f)
    };
        
        //transports[0] = new Cotxe("Mercedes", "M220", 220, true,4,4);
        //transports[1] = new Tren("BritRail", "b70 large", 120.0f, true,48,1.5f,24);
        //transports[2] = new Patinet("SeaRider", "sr550h", 50f, false, 0.1f, 2*2f);
        //transports[3] = new Submari("Subway", "ss980", 40.5f, true,1500f, 9.5f, 5000,2000);
        //transports[4] = new Vaixell("SeaRider", "br1040t", 62f, true, 5f);
        boolean start = true;
        while (start) {
            
        }

        for (Transport transport : transports) {
            System.out.println(transport);
        }
    }
    public static void printMenu(String[] opcions) {
        for (String string : opcions) {
            
        }
        System.out.println("/**"+"*"*+"**\\");
    }
}
