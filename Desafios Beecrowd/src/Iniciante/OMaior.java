package Iniciante;

import java.util.Scanner;
import static java.lang.Math.abs;

public class OMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //Formula para descobrir o maior numero entre a e b
        int MaiorAB = (a+b+abs(a-b))/2;

        //Formula para descobrir o maior numero entre o resultado de "MaiorAB" e c
        int valorMaior = (MaiorAB+c+abs(MaiorAB-c))/2;

        System.out.println(valorMaior + " eh o maior");
    }
}
