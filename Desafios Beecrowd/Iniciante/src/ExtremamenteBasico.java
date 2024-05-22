import java.util.concurrent.ThreadLocalRandom;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        int A = (int) valorAleatorio();
        int B = (int) valorAleatorio();
        int X = A + B;
        System.out.println("X = " + X);
    }
    private static double valorAleatorio () {
        return ThreadLocalRandom.current().nextInt(1, 50);
    }
}
