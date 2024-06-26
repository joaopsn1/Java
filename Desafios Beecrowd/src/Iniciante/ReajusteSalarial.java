package Iniciante;

/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:


                        Salário	        Percentual de Reajuste
                    0 - 400.00                  15%
                    400.01 - 800.00             12%
                    800.01 - 1200.00            10%
                    1200.01 - 2000.00           7%
                    Acima de 2000.00            4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o percentual de reajuste ganho, conforme exemplo abaixo.
 */

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
