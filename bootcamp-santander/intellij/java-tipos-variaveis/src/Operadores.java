public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        //x repetição
        numero++; // mesma coisa que numero = numero +1

        System.out.println(numero);

        boolean variavel = false;

        variavel = !variavel;

        System.out.println(variavel);

        int a, b;
        a = 5;
        b= 5;

        String resultado = a==b ?"Verdadeiro" : "Falso";

        /*
        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        */

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        String nomeUm = "JOÃO";
        String nomeDois = new String("JOÃO"); // Objeto

        System.out.println(nomeUm.equals(nomeDois)); //Para objetos usar o "equals()"

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim");
    }
}
