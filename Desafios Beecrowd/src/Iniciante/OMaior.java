package Iniciante;

/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

https://resources.beecrowd.com/gallery/images/problems/UOJ_1013.png

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

import java.util.Scanner;
import static java.lang.Math.abs;

public class OMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //Formula para descobrir o maior numero entre a e b
        int MaiorAB = (a+b+abs(a-b))/2;

        //Formula para descobrir o maior numero entre o resultado de "MaiorAB" e c
        int valorMaior = (MaiorAB+c+abs(MaiorAB-c))/2;

        System.out.println(valorMaior + " eh o maior");
    }
}
