package Desafios;

/*
    Desafio 14 - Encontre o maior número primo da lista:
    Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        Optional<Integer> maiorNumeroPrimo = numeros.stream()
                .filter(Desafio14::primo) //Filtrar número primo
                .max(Comparator.naturalOrder()); //Pegar o maior valor de número primo
        System.out.println("Maior numero primo da lista é: " + maiorNumeroPrimo.get());
    }
    
    public static boolean primo (int number) { //Criar outra classe para definir se existem números primos na lista
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
