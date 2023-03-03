import java.util.HashMap;
public class Concesionari {
    public static HashMap<String, Cotxe> cotxes = new HashMap<String, Cotxe>();
    /**
     *
     *
     * */
    public static void main(String[] args) {
        cotxes.put("1234-abc", new CotxeCombustio("1234-abc",5001,100,20));
        cotxes.put("2345-bcd", new CotxeCombustio("2345-bcd",6000, 200, 10));
        cotxes.put("3456-cde", new CotxeElectric("3456-cde",10000,150));
        cotxes.put("4567-def", new CotxeElectric("4567-def",9999,250));

        System.out.println(cotxes.containsKey("1234-abc"));
        System.out.println(cotxes.containsKey("1234-abc"));
        System.out.println(cotxes.containsKey("1234-abc"));
        System.out.println(cotxes.containsKey("1234-abc"));
    }


}