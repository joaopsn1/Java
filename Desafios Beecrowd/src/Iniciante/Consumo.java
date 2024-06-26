package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Distancia em KM
        int distancia = scanner.nextInt();
        //Combustivel em litros
        double combustivel = scanner.nextDouble();
        double consumo = distancia/combustivel;

        DecimalFormat df = new DecimalFormat("0.000");
        String consumoFormatado = df.format(consumo);
        System.out.println(consumoFormatado + " km/l");
    }
}
