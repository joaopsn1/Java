import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peça1 = scanner.nextInt();
        int numeroPeça1 = scanner.nextInt();
        double valorPeça1 = scanner.nextDouble();

        int peça2 = scanner.nextInt();
        int numeroPeça2 = scanner.nextInt();
        double valorPeça2 = scanner.nextDouble();

        double valorPagar = (numeroPeça1*valorPeça1) + (numeroPeça2*valorPeça2);

        DecimalFormat df = new DecimalFormat("0.00");
        String valorFormatado = df.format(valorPagar);

        System.out.println("VALOR A PAGAR: R$ " + valorFormatado);
    }
}
