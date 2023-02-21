public class Concesionari {
    public static Cotxe[] cotxes = {new CotxeCombustio("1234-abc",5001,100,20),
                                    new CotxeCombustio("2345-bcd",6000, 200, 10),
                                    new CotxeElectric("3456-cde",10000,150),
                                    new CotxeElectric("4567-def",9999,250)};
    /**
     *
     *
     * */
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(cotxes[0].getInfo());
        System.out.println(cotxes[1].getInfo());
        System.out.println(cotxes[2].getInfo());
        System.out.println(cotxes[3].getInfo());
    }


}