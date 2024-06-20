import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Tempo em segundos
        int totalSegundos = scanner.nextInt();
        //Conversão do tempo em horas:minutos:segundos
        int horas = totalSegundos/3600;
        int minutos = (totalSegundos%3600)/60;
        int segundos = totalSegundos%60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
