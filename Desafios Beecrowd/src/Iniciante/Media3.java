package Iniciante;

/*
Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

Saída
Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a descrição do problema. Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Notas de um Aluno
        double N1 = scanner.nextDouble();
        double PesoN1 = 2.0;
        double N2 = scanner.nextDouble();
        double PesoN2 = 3.0;
        double N3 = scanner.nextDouble();
        double PesoN3 = 4.0;
        double N4 = scanner.nextDouble();
        double PesoN4 = 1.0;
        double media = (N1*PesoN1 + N2*PesoN2 + N3*PesoN3 + N4*PesoN4)/(PesoN1 + PesoN2 + PesoN3 + PesoN4);

        DecimalFormat df = new DecimalFormat("0.0");
        String mediaFormatada = df.format(media);
        System.out.println("Media: " + mediaFormatada);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double notaExame = scanner.nextDouble();
            System.out.println("Nota do exame: " + notaExame);
            double mediaFinal = (media + notaExame)/2;
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + mediaFinal);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + mediaFinal);
            }
        }
    }
}
