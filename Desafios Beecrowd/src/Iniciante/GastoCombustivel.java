package Iniciante;

/*
Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.

Entrada
O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).

Saída
Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Consumo em Km/L;
        int consumo = 12;
        //Tempo gasto em horas na viagem;
        int tempo = scanner.nextInt();
        //Velocidade média em Km/h;
        int velocidade = scanner.nextInt();
        //Distancia percorrida;
        int distancia = velocidade*tempo;
        //Quantidade de litros necessários para a viagem;
        double combustivel = (double) distancia/consumo;
        //Formatar com 3 casas decimais;
        DecimalFormat df = new DecimalFormat("0.000");
        String combustivelFormatado = df.format(combustivel);

        System.out.println(combustivelFormatado);
    }
}
