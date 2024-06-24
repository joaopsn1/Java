public class IPhone {
    public static void main(String[] args) {
        ReprodutorMusical musica = new ReprodutorMusical();
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        System.out.println("---------------");

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println("---------------");

        NavegadorInternet internet = new NavegadorInternet();
        internet.adicionarNovaAba();
        internet.atualizarPagina();
        internet.exibirPagina();
    }
}
