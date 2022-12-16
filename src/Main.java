import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String ord = Milton.test();
        String shh = Milton.gissaord(ord);
        System.out.println(ord);
        System.out.println(shh);
    }
}