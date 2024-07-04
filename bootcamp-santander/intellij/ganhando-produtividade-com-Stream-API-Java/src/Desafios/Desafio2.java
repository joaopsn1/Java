package Desafios;

/*
    Desafio 2 - Imprima a soma dos números pares da lista:
    Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Somar numeros pares
        int somaNumerosPar = numeros.stream()
                .filter(n -> (n % 2 == 0)) //Filtra os numeros pares
                .mapToInt(Integer::intValue)//Converte Integer para int
                .sum(); //Soma os valores pares
        System.out.println("Soma dos números pares: " + somaNumerosPar);
    }
}
