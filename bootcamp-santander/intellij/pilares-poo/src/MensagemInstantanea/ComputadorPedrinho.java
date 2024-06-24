package MensagemInstantanea;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

import java.util.Scanner;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicoMensagemInstantanea smi = null;
        /*
            NÃO SE SABE QUAL APP
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        */
        String appEscolhido = scanner.next();

        if (appEscolhido.equals("MSN")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("Facebook")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("Telegram")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
