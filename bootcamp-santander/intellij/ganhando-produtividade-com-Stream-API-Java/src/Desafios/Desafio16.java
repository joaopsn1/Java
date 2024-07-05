package Desafios;

/*
    Desafio 16 - Agrupe os números em pares e ímpares:
    Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
 */

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Stream<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0); //Filtra números pares

        Stream<Integer> numerosImpares = numeros.stream()
                .filter(n -> n % 2 != 0); //Filtra números ímpares

        System.out.println("Números pares: " + numerosPares.collect(Collectors.toList())); //Coloca os itens filtrados em lista
        System.out.println("Números impares: " + numerosImpares.collect(Collectors.toList())); //Coloca os itens filtrados em lista
    }
}
