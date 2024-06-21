import java.text.DecimalFormat;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        //Delta
        double delta = Math.pow(B,2) - 4*A*C;

        //Raiz 1
        double R1 = (-(B) + Math.sqrt(delta))/(2*A);
        //Raiz 2
        double R2 = (-(B) - Math.sqrt(delta))/(2*A);
        //Condicional

        DecimalFormat r1f = new DecimalFormat("0.00000");
        String R1Formatado = r1f.format(R1);

        DecimalFormat r2f = new DecimalFormat("0.00000");
        String R2Formatado = r1f.format(R2);

        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.println("R1 = " + R1Formatado);
            System.out.println("R2 = " + R2Formatado);
        }
    }
}
