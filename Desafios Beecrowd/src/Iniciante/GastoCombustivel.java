package Iniciante;

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
