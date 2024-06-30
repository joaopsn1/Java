package Iniciante;

/*
Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

https://resources.beecrowd.com/gallery/images/problems/UOJ_1050.png

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

Entrada
A entrada consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.
 */

import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ddd = scanner.nextInt();

        if (ddd == 61) {
            System.out.println("Brasilia");
        } else if (ddd == 71) {
            System.out.println("Salvador");
        } else if (ddd == 11) {
            System.out.println("Sao Paulo");
        } else if (ddd == 21) {
            System.out.println("Rio de Janeiro");
        } else if (ddd == 32) {
            System.out.println("Juiz de Fora");
        } else if (ddd == 19) {
            System.out.println("Campinas");
        } else if (ddd == 27) {
            System.out.println("Vitoria");
        } else if (ddd == 31) {
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}
