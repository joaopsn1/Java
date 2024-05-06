package edu.joao.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");

        int ano = 2024; // número inteiro
        System.out.println(ano);

        String BR = "Brasil"; // palavras
        System.out.println(BR);

        String meuNome = "João Pedro";
        System.out.println(meuNome);

        int anoFabricacao = 2022;
        System.out.println(anoFabricacao);

        boolean verdadeira = true; // variável booleana
        System.out.println(verdadeira);

        String primeiroNome = "João Pedro";
        String segundoNome = "Souza Nunes";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) { // método
        return "Resultado do método é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
