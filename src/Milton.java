import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Milton {
    public static String test() throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/svenska-ord.txt"));
        String[] ord = new String[122312];
        int x;
        for (x = 0; x < 300; x++) {
            ord[x] = in.nextLine();
        }
        int randomNum = ThreadLocalRandom.current().nextInt(0, 300 + 1);
        return ord[randomNum];
    }

    public static String gissaord(String x) throws FileNotFoundException {
        String ord = x;
        int antal = ord.length();
        int u = 0;
        char[] hemlig = new char[antal];
        for (u = 0; u < antal; u++) {
            hemlig[u] = '-';
        }
        String superhemlig = String.valueOf(hemlig);
        return superhemlig;
    }

    public static String  gissning(String y) throws FileNotFoundException {
        int ordlangd = y.length();
        char[] gissningen = new char[ordlangd];
        String[] svar = new String[9];
        String[] superhemlig = new String[9];
        int fel = 0;
        int superfel = 0;
        char[] bokstaven = new char[9];
        int z;
        int k = 0;
        int g = 0;
        int x = 0;
        while ( g < 9 && y != svar[g] ) {
            bokstaven[g] = Noel.lasInEnBokstav();
            for (z = 0; z < ordlangd; z++) {
                if (x == y.charAt(z)) {
                    gissningen[z] = bokstaven[g];

                } else {
                    gissningen[z] = '-';
                    fel++;

                }
                if (fel == ordlangd) {
                    superfel++;
                } else {
                    superhemlig[g] = String.valueOf(gissningen);
                    svar[g] = superhemlig[g];
                }
            }
            g++;
        }
        return svar[8];

    }
    }




