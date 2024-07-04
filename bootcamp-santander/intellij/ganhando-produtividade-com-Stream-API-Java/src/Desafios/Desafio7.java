package Desafios;

/*
    Desafio 7 - Encontrar o segundo número maior da lista:
    Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
            Optional<Integer> maiorNumero = numeros.stream()
                .max(Comparator.naturalOrder());

            Optional<Integer> segundoMaiorNumero = numeros.stream()
                        .filter(n -> n < maiorNumero.get())
                                .max(Comparator.naturalOrder());
        */

        Optional<Integer> segundoMaior = numeros.stream()
                        .distinct() //Retira duplicatas
                        .sorted((a, b) -> b - a) //Ordena em ordem decrescente
                        .skip(1) //Pula o primeiro (maior) elemento
                        .findFirst(); //Encontra o segundo maior


        System.out.println("O segundo maior número da lista é: " + segundoMaior.get());
    }
}
