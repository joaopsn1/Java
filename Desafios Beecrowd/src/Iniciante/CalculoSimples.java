package Iniciante;

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

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
