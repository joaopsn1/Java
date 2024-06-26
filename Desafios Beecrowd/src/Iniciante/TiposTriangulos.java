package Iniciante;

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

