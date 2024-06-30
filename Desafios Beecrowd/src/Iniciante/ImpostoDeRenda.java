package Iniciante;

/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

https://resources.beecrowd.com/gallery/images/problems/UOJ_1051_pt.png

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".
 */

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double difSalario =0;
        double restoSalario =0;
        double imposto = 0;

        if (salario >= 0 && salario <= 2000) {
            System.out.println("Isento");
        } else if (salario > 2000 && salario <= 3000) {
            difSalario = salario - 2000;
            imposto = difSalario*0.08;
            System.out.println(String.format("R$ %.2f" , imposto)); //Duas casas decimais
        } else if (salario > 3000 && salario <= 4500) {
            difSalario = salario - 3000;
            imposto = difSalario*0.18 + 80;
            System.out.println(String.format("R$ %.2f" , imposto)); //Duas casas decimais
        } else {
            difSalario = salario - 4500;
            imposto = difSalario*0.28 + 350;
            System.out.println(String.format("R$ %.2f" , imposto)); //Duas casas decimais
        }
    }
}
