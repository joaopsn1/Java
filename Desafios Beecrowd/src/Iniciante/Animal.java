package Iniciante;/*
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.

https://resources.beecrowd.com/gallery/images/problems/UOJ_1049_b.png

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.
 */

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra1 = scanner.next();
        String palavra2 = scanner.next();
        String palavra3 = scanner.next();

        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (palavra2.equalsIgnoreCase("mamifero")) {
                    if (palavra3.equalsIgnoreCase("onivoro")) {
                        System.out.println("homem");
                    } else {
                        System.out.println("vaca");
                    }
                }
            }
        } else {
            if (palavra2.equalsIgnoreCase("inseto")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
