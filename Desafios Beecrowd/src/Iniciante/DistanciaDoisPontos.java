package Iniciante;

/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = https://resources.beecrowd.com/gallery/images/problems/UOJ_1015.png

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanciaDoisPontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        //Raiz quadrada da expressão
        double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));


        //Formatar casas decimais
        DecimalFormat df = new DecimalFormat("0.0000");
        String formatDistancia = df.format(distancia);

        //Imprimir resultado
        System.out.println(formatDistancia);
    }
}
