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
