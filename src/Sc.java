import java.util.Scanner;

public class Sc {
    private static final Scanner scanner = new Scanner(System.in);

    public static double nextDouble(){
        return Double.parseDouble(scanner.next().replace(',', '.'));
    }
}
