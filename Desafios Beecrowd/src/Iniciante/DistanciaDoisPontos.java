package Iniciante;

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
