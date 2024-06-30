package Iniciante;

/*
Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        int i;
        for (i = 0; i < 6; i++) {
            double n = scanner.nextDouble();
            if (n > 0) {
                cont ++;
            }
        }
        System.out.println(cont + " valores positivos");
    }
}
