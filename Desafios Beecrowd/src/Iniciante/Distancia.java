package Iniciante;

/*
Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.

Entrada
O arquivo de entrada contém um número inteiro.

Saída
Imprima o tempo necessário seguido da mensagem "minutos".
 */

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
