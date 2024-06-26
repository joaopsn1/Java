package Iniciante;

/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        //Área Iniciante.Triangulo
        double areaTriangulo = A*C/2;
        DecimalFormat df = new DecimalFormat("0.000");
        String trianguloFormatado = df.format(areaTriangulo);
        System.out.println("TRIANGULO: " + trianguloFormatado);

        //Área Circulo
        double PI = 3.14159;
        double areaCirculo = PI*(Math.pow(C,2));
        DecimalFormat cf = new DecimalFormat("0.000");
        String circuloFormatado = cf.format(areaCirculo);
        System.out.println("CIRCULO: " + circuloFormatado);

        //Área Trapezio
        double areaTrapezio = (A+B)*C/2;
        DecimalFormat tf = new DecimalFormat("0.000");
        String trapezioFormatado = tf.format(areaTrapezio);
        System.out.println("TRAPEZIO: " + trapezioFormatado);

        //Área Quadrado
        double areaQuadrado = B*B;
        DecimalFormat qf = new DecimalFormat("0.000");
        String quadradoFormatado = qf.format(areaQuadrado);
        System.out.println("QUADRADO: " + quadradoFormatado);

        //Área Retangulo
        double areaRetangulo = A*B;
        DecimalFormat rf = new DecimalFormat("0.000");
        String retanguloFormatado = rf.format(areaRetangulo);
        System.out.println("RETANGULO: " + retanguloFormatado);
    }
}
