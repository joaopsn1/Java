package Iniciante;

/*
Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.
 */

import java.util.concurrent.ThreadLocalRandom;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        int A = (int) valorAleatorio();
        int B = (int) valorAleatorio();
        int X = A + B;
        System.out.println("X = " + X);
    }
    private static double valorAleatorio () {
        return ThreadLocalRandom.current().nextInt(1, 50);
    }
}
