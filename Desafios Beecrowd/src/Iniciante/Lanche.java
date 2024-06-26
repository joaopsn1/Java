package Iniciante;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

https://resources.beecrowd.com/gallery/images/problems/UOJ_1038_pt.png

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Código dos itens do cardápio
        int codigo = scanner.nextInt();

        //Quantidade a ser pedida
        int quantidade = scanner.nextInt();

        //Condicional para Switch
        switch (codigo) {
            case 1: {
                double cachorroQuente = 4.00;
                double valorPagar = cachorroQuente*quantidade;
                DecimalFormat df = new DecimalFormat("0.00");
                String valorFormatado = df.format(valorPagar);
                System.out.println("Total: R$ " + valorFormatado);
                break;
            }
            case 2: {
                double xSalada = 4.50;
                double valorPagar = xSalada*quantidade;
                DecimalFormat df = new DecimalFormat("0.00");
                String valorFormatado = df.format(valorPagar);
                System.out.println("Total: R$ " + valorFormatado);
                break;
            }
            case 3: {
                double xBacon = 5.00;
                double valorPagar = xBacon*quantidade;
                DecimalFormat df = new DecimalFormat("0.00");
                String valorFormatado = df.format(valorPagar);
                System.out.println("Total: R$ " + valorFormatado);
                break;
            }
            case 4: {
                double torradaSimples= 2.00;
                double valorPagar = torradaSimples*quantidade;
                DecimalFormat df = new DecimalFormat("0.00");
                String valorFormatado = df.format(valorPagar);
                System.out.println("Total: R$ " + valorFormatado);
                break;
            }
            case 5: {
                double refrigerante = 1.50;
                double valorPagar = refrigerante*quantidade;
                DecimalFormat df = new DecimalFormat("0.00");
                String valorFormatado = df.format(valorPagar);
                System.out.println("Total: R$ " + valorFormatado);
                break;
            }
        }
    }
}
