package Desafios;

/*
    Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
    Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosRepetidos = numeros.stream()
                .distinct() //Obtem uma stream de elementos distintos
                .count() == numeros.size(); //Conta os elementos distintos e compara com o tamanho original da lista para determinar se todos os números são distintos ou nao

        System.out.println(numerosRepetidos);
    }
}
