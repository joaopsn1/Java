package Iniciante;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Array para declarar as notas
        int [] notas = {100,50,20,10,5,2,1};
        int N = scanner.nextInt();
        System.out.println(N);
        for (int nota : notas) {
            int quantidadeNotas = N/nota;
            N = N%nota;
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ",00");
        }
    }
}
