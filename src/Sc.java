import java.util.Scanner;

public class Sc {
    private static final Scanner scanner = new Scanner(System.in);

    public static double nextDouble(){
        return Double.parseDouble(scanner.next().replace(',', '.'));
    }

    public static String next(){return scanner.next();}

    public static Byte nextByte(){return scanner.nextByte();}

    public static void close(){scanner.close();}
}
