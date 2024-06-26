package Iniciante;

/*
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TiposTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        //Ordenar os lados em ordem descrescente
        Double [] lados = {A,B,C};
        Arrays.sort(lados, Collections.reverseOrder());

        A = lados[0];
        B = lados[1];
        C = lados[2];

        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || C == B) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}

