//Path pathActual = Paths.get(System.getProperty("user.dir"));
//Path pathFitxer = Paths.get(pathActual.toString(), "src/dades", "04021911.DAT");

package Exercicis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PareNoelASCII {
    private static final String PARENOEl = "*<]:-DOo";
    private static final String REN = ">:o)";
    private static final String FOLLET = "<]:-D";
    private static final String PATH_FITXER = "C:\\Users\\xmartin\\Documents\\regexp\\blanes.txt";

    private static int getNum(String s, String p) {
        int n=0;
        while(s.indexOf(p) > -1) {
            s = s.substring(s.indexOf(p) + p.length());
            n++;
        }
        return n;
    }
    private static int getNumR(String s, String p) {
        if(s.indexOf(p) < 0 ) return 0;
        else return getNumR(s.substring(s.indexOf(p) + p.length()), p) + 1;
    }

    public static void main(String[] args) {
        BufferedReader br = null;
        FileReader fr = null;
        int numPN = 0;
        int numRen = 0;
        int numF = 0;

        try {
            fr = new FileReader(PareNoelASCII.PATH_FITXER);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null) {
                numPN = getNumR(line,PARENOEl);
                if(numPN>0) System.out.print("Pare Noel (" + numPN + ") ");
                numRen = getNumR(line,REN);
                if(numRen>0) System.out.print("Ren (" + numRen + ") ");
                numF = getNumR(line, FOLLET);
                if(numF-numPN>0) System.out.print("Follet (" + numF + ") ");

                System.out.println("");
                numPN=0;numRen=0;numF=0;
                line = br.readLine();
            }
            fr.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}