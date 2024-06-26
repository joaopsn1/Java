package Iniciante;

/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Tempo em segundos
        int totalSegundos = scanner.nextInt();
        //Conversão do tempo em horas:minutos:segundos
        int horas = totalSegundos/3600;
        int minutos = (totalSegundos%3600)/60;
        int segundos = totalSegundos%60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
