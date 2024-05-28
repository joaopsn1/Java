import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo: R$ ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor do saque: R$ ");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso");
        } else {
            saldo = saque - saldo;
            if (saldo <= limiteChequeEspecial) {
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}