public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNome("João Pedro");

        Conta cc = new ContaCorrente(joao);
        Conta poupanca = new ContaPoupanca(joao);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
