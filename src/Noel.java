import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.ThreadLocalRandom;

public class Noel{
// skapa respons till personens gissningar, om det är rätt eller fel
        public static void main(String[] args){
                char bokstav = Noel.lasInEnBokstav();
        }

        public static char lasInEnBokstav() {
                Scanner in = new Scanner(System.in);
                String gissning = in.next();
                return gissning.charAt(0);
        }

        public static boolean KollaOmBokstavFinns() {

        }
}
