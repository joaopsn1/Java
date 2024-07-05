package Desafios;

/*
    Desafio 17 - Filtrar os números primos da lista:
    Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Stream<Integer> numerosPrimos = numeros.stream()
                .filter(Desafio17::primo);

        System.out.println("Números primos da lista: " + numerosPrimos.collect(Collectors.toList()));
    }

    public static boolean primo (int number) {
        if (number <= 1) {
            return false;
        } else if (number == 2 || number == 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
