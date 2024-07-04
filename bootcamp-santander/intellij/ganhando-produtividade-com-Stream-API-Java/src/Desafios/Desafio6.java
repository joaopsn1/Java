package Desafios;

/*
    Desafio 6 - Verificar se a lista contém algum número maior que 10:
    Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosMaiorQue10 = numeros.stream()
                .allMatch(n -> n > 10); //Verifica se todos os itens da lista são maiores que 10
        System.out.println("Existem números maiores que 10 na lista? " + numerosMaiorQue10);
    }
}
