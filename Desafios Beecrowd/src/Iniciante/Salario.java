package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int horas = scanner.nextInt();
        double valorHora = scanner.nextDouble();
        double salario = horas*valorHora;

        System.out.println("NUMBER = " + numero);

        DecimalFormat df = new DecimalFormat("0.00");
        String salarioFormatado = df.format(salario);

        System.out.println("SALARY = U$ " + salarioFormatado);
    }
}
