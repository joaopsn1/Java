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
