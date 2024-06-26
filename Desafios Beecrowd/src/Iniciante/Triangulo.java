package Iniciante;

/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:


Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem


Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
 */

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if (A<(B+C) && B<(A+C) && C<(A+B)) {
            double perimetroTriangulo = A+B+C;
            System.out.println("Perimetro = " + perimetroTriangulo);
        } else {
            double areaTrapezio = ((A+B)*C)/2;
            System.out.println("Area = " + areaTrapezio);
        }
    }
}
