package Desafios;

/*
    Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
    Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroNegativo = numeros.stream()
                .allMatch(n -> n < 0); //Verifica se há números negativos na lista
        System.out.println("Há número negativos na lista? " + numeroNegativo);
    }
}
