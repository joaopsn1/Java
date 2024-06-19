import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        double comissao = vendas*0.15;
        double total = salario + comissao;

        DecimalFormat df = new DecimalFormat("0.00");
        String totalFormatado = df.format(total);

        System.out.println("TOTAL = R$ " + totalFormatado);
    }
}
