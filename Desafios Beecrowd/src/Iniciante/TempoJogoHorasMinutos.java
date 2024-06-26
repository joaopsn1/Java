package Iniciante;

/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
 */

import java.util.Scanner;

public class TempoJogoHorasMinutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        int inicioEmMinutos = horaInicial*60 + minutoInicial;
        int fimEmMinutos = horaFinal*60 + minutoFinal;
        int duracaoEmMinutos;

        if (inicioEmMinutos < fimEmMinutos) {
            duracaoEmMinutos = fimEmMinutos - inicioEmMinutos;
        } else {
            duracaoEmMinutos = (24*60 - inicioEmMinutos) + fimEmMinutos;
        }

        int duracaoHora = duracaoEmMinutos/60;
        int duracaoMinuto = duracaoEmMinutos % 60;

        if (duracaoEmMinutos == 0) {
            duracaoHora = 24;
            duracaoMinuto = 0;
        }

        System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMinuto + " MINUTO(S)");
    }
}
