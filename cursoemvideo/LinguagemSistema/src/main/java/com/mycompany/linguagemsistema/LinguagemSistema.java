package com.mycompany.linguagemsistema;

import java.util.Locale;

public class LinguagemSistema {

    public static void main(String[] args) {
        Locale linguagem = Locale.getDefault(); //Capturar o idioma do Sistema
        System.out.println("A linguagem do sistema esta em");
        System.out.println(linguagem.getDisplayLanguage()); //Imprime Português
    }
}
