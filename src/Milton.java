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
        int randomNum = ThreadLocalRandom.current().nextInt(0,  300+ 1);
        return ord[randomNum];
        }

    public static String gissaord(String x) throws FileNotFoundException {
        String ord = x;
        int antal = ord.length();
        int u = 0;
        char[] hemlig = new char[antal];
        for (u=0;u<antal;u++ ) {
            hemlig[u] = '-';
        }
        String superhemlig = String.valueOf(hemlig);
        return superhemlig;
        }

    }




