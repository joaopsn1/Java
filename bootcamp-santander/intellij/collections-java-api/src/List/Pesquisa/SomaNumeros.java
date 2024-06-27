package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributo
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        //Adicionando numeros
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(24);

        //Exibindo numeros adicionados
        System.out.println("Numeros adicionados: ");
        somaNumeros.exibirNumeros();

        //Calculando e exibindo a soma de numeros da lista
        System.out.println("Soma dos numeros: " + somaNumeros.calcularSoma());

        //Encontrando e exibindo o maior numero da lista
        System.out.println("O maior numero da lista: " + somaNumeros.encontrarMaiorNumero());

        //Encontrando e exibindo o menor numero da lista
        System.out.println("O menor numero da lista: " + somaNumeros.encontrarMenorNumero());
    }
}
