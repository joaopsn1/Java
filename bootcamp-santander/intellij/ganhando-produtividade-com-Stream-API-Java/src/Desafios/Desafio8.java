package Desafios;

/*
    Desafio 8 - Somar os dígitos de todos os números da lista:
    Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
                .reduce(0, Integer::sum); //Vai somar os elementos da lista e atualizar o valor no lugar do 0 para continuar a soma

        System.out.println("Qual o valor da soma de todos os números da lista? " + soma);
    }
}
