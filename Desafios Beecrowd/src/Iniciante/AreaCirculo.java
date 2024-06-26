package Iniciante;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double PI = 3.14159;
        double raio = scanner.nextDouble();
        double area = PI*(Math.pow(raio, 2));

        //Formatar em casas decimais
        DecimalFormat df = new DecimalFormat("#.0000");

        String areaFormatada = df.format(area);

        System.out.println("Area = " + areaFormatada);
    }
}
