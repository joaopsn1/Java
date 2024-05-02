package com.mycompany.horadosistema;

import java.util.Date;

public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date(); //Capturar a Hora do Sistema
        System.out.println("A hora do sistema e");
        System.out.println(relogio.toString()); //Imprime a hora do sistema
    }
}
