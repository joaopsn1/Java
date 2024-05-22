import java.util.concurrent.ThreadLocalRandom;

public class AreaCirculo {
    public static void main(String[] args) {
        double PI = 3.14;
        int raio = valorAleatorio();
        double area = PI*Math.pow(raio, 2);
        System.out.println("Area = " + area);
    }
    private static int valorAleatorio () {
        return ThreadLocalRandom.current().nextInt(1, 5);
    }
}
