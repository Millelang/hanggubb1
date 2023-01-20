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

        public static String RitaBild (int n) {
                String bild = "";
                if (n == 0) {
                        bild =  "\n" +
                                " ______"+ "\n" +
                                "/      \\";
                }
                else if (n == 1) {
                        bild = "\n"+
                                "  /  \\" + "\n" +
                                " ______" + "\n" +
                                "/      \\";
                }
                else if (n == 2) {
                        bild = "\n"+
                                "   __" + "\n" +
                                "  /  \\" + "\n" +
                                " ______" + "\n" +
                                "/      \\";
                }
                else if (n == 3) {
                        bild = "\n"+
                                "   ||" + "\n" +
                                "   __" + "\n" +
                                "  /  \\" + "\n" +
                                " ______" + "\n" +
                                "/      \\";

                } else if (n == 4) {
                        bild = "\n"+
                                "   ||" + "\n" +
                                "   ||" + "\n" +
                                "   __" + "\n" +
                                "  /  \\" + "\n" +
                                " ______" + "\n" +
                                "/      \\";

                }
                else if (n == 5) {
                        bild = "\n"+
                                "  /||" + "\n" +
                                " / ||" + "\n" +
                                "   __" + "\n" +
                                "  /  \\" + "\n" +
                                " ______" + "\n" +
                                "/      \\";
                }
                else if (n == 6) {
                        bild = "\n"+
                                "  /||\\" + "\n" +
                                " / || \\" + "\n" +
                                "   __" + "\n" +
                                "  /  \\" + "\n" +
                                " ______" + "\n" +
                                "/      \\";

                }
                else if (n == 7) {
                        bild = "\n"+
                                "   ||" + "\n" +
                                "  /||\\" + "\n" +
                                " / || \\" + "\n" +
                                "   __" + "\n" +
                                "  /  \\" + "\n" +
                                " ______" + "\n" +
                                "/      \\";
                }
                else if (n == 8) {
                        bild = "\n"+
                                "   ||" + "\n" +
                                "   ||" + "\n" +
                                "  /||\\" + "\n" +
                                " / || \\" + "\n" +
                                "   __" + "\n" +
                                "  /  \\" + "\n" +
                                " ______" + "\n" +
                                "/      \\";

                }
                else if (n == 9) {
                        bild = "\n"+
                                "   /\\" +   "\n" +
                                "  |..| " + "\n" +
                                " \\  /" + "\n" +
                                "   ||" + "\n" +
                                "   ||" + "\n" +
                                "  /||\\" + "\n" +
                                " / || \\" + "\n" +
                                "   __" + "\n" +
                                "  /  \\" + "\n" +
                                " ______" + "\n" +
                                "/      \\";
                }
return  bild;
        }



        }




