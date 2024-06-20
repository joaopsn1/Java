import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        O carro 1 sai do repouso a 60 Km/h;
        O carro 2 sai do repouso a 90 Km/h;
        O carro 2 em 60 minutos se afasta 30 Km do carro 1, ou seja, 1 Km a cada 2 minutos;
        */

        //Ler a distancia e o tempo para calcular quanto tempo o carro 1 alcança o carro 2
        int distancia = scanner.nextInt();
        //Tempo em minutos
        int tempo = distancia*2;

        System.out.println(tempo + " minutos");
    }
}
