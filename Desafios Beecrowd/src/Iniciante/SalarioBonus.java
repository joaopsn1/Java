package Iniciante;

/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

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
