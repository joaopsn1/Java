import java.text.DecimalFormat;
import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double novoSalario = 0.0;
        double reajuste = 0.0;
        int percentual = 0;

        if (salario <= 400) {
            percentual = 15;
        } else if (salario > 400 && salario <= 800) {
            percentual = 12;
        } else if (salario > 800 && salario <= 1200) {
            percentual = 10;
        } else if (salario > 1200 && salario <= 2000) {
            percentual = 7;
        } else {
            percentual = 4;
        }

        reajuste = salario*percentual/100;
        DecimalFormat rf = new DecimalFormat("0.00");
        String reajusteFormatado = rf.format(reajuste);

        novoSalario = salario + reajuste;
        DecimalFormat df = new DecimalFormat("0.00");
        String novoSalarioFormatado = df.format(novoSalario);

        System.out.println("Novo salario: " + novoSalarioFormatado);
        System.out.println("Reajuste ganho: " + reajusteFormatado);
        System.out.println("Em percentual: " + percentual + " %");
    }
}
