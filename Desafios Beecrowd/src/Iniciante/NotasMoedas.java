package Iniciante;

/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] notas = {100,50,20,10,5,2};
        double [] moedas = {1,0.50,0.25,0.10,0.05,0.01};

        double valor = scanner.nextDouble();

        //Converter valor para centavos para evitar problemas de precisão com ponto flutuante
        int centavos = (int) Math.round(valor*100);

        System.out.println("NOTAS: ");
        for (int nota : notas) {
            int quantidadeNotas = centavos/(nota*100);
            centavos = centavos%(nota*100);
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ".00");
        }

        System.out.println("MOEDAS: ");
        for (double moeda : moedas) {
            int quantidadeMoedas = (int) (centavos/(moeda*100));
            centavos = (int) (centavos%(moeda*100));

            DecimalFormat df = new DecimalFormat("0.00");
            String moedasFormatadas = df.format(moeda);
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + moedasFormatadas);
        }
    }
}
