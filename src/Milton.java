import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Milton {
    public static String test(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/svenska-ord.txt"));
        String[] ord = new String[122312];
        int x;
        for (x = 0; x < 122312; x++) {
            ord[x] = in.nextLine();
        }
        int randomNum = ThreadLocalRandom.current().nextInt(0,  122312+ 1);
        System.out.println(ord[randomNum]);
        return ord[randomNum];
        }
        }


