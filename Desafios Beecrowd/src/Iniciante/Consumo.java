package Iniciante;

/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
 */

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
