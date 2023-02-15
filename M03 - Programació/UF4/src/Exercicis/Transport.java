package Exercicis;

public class Transport {
    private static int totalCount;
    private String marca;
    private String model;
    private float kmHora;
    private boolean motoritzat;

    public Transport(String marca, String model, float kmHora, boolean motoritzat) {
        try {
            this.marca = marca;
            this.model = model;
            this.kmHora = kmHora;
            this.motoritzat = motoritzat;
            totalCount++;
        } catch (Exception e) {
            System.out.println("No compleix les especificacons per ser un Transport degut al seguent error:\n"+e);
        }
    }
    @Override
    public String toString() {
        String str = "\n\nCom a Transport...\n\nLa marca es: " + marca + "\nEl model: " + model + "\nLa velocitat es de: " + kmHora + "Km/h\nMotoritzat: " + motoritzat;
        return (str);
    }

    public static int getTotalCount() {
        return totalCount;
    }
}