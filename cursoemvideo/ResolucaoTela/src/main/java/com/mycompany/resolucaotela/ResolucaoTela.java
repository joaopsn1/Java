package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit(); //Captura a resolução do Sistema
        System.out.println("A resolucao do sistema e");
        Dimension d = resolucao.getScreenSize(); // Captura as medidas de Larg x Alt do sistema
        System.out.println(d.width + "X" + d.height); //Escreve na tela as medidas
    }
}
