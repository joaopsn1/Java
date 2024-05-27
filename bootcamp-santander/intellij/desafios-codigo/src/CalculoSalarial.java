import java.util.Scanner;

public class CalculoSalarial {
    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);
        System.out.print("Salário: R$ ");
        float valorSalario = leitorDeEntradas.nextFloat();
        System.out.print("Benefício: R$ ");
        float valorBeneficio = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //Atribui alíquota de 5% mediante ao salário
            valorImposto = 0.05F*valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            //Atribui alíquota de 10% mediante ao salário
            valorImposto = 0.10F*valorSalario;
        } else {
            //Atribui alíquota de 15% mediante ao salário
            valorImposto = 0.15F*valorSalario;
        }

        //Calcula e imprime a saída (com 2 casas decimais)
        float saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("%.2f", saida)); 
    }
}
