package Iniciante;

/*
Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.

Entrada
A entrada contém um único valor inteiro.

        Saída
Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.
*/

import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mes = scanner.nextInt();

        if (mes == 1) {
            System.out.println("January");
        } else if (mes == 2) {
            System.out.println("February");
        } else if (mes == 3) {
            System.out.println("March");
        } else if (mes == 4) {
            System.out.println("April");
        } else if (mes == 5) {
            System.out.println("May");
        } else if (mes == 6) {
            System.out.println("June");
        } else if (mes == 7) {
            System.out.println("July");
        } else if (mes == 8) {
            System.out.println("August");
        } else if (mes == 9) {
            System.out.println("September");
        } else if (mes == 10) {
            System.out.println("October");
        } else if (mes == 11) {
            System.out.println("November");
        } else if (mes == 12) {
            System.out.println("December");
        } else {
            System.out.println("Este mes não existe");
        }
    }
}
