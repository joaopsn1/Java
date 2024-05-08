public class TiposVariaveis {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");

        double salarioMinimo = 2.500;
        System.out.println(salarioMinimo);
        System.out.println();

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Cast

        final double VALOR_DE_PI = 3.14; // Precisa do "final" para não permitir alterar a variável

        String nomeCompleto = "LINGUAGEM" + "JAVA"; // "+" serve para concatenar os textos, juntá-los
        System.out.println(nomeCompleto);

        String concatenação = "?";

        concatenação = 1+1+1+"1"; // Como a string está por último, primeiro soma e depois concatena o último valor
        System.out.println(concatenação);

        concatenação = 1+"1"+1+1; // Após ele identificar uma string, não consegue mais realizar soma
        System.out.println(concatenação);

        concatenação = 1+"1"+1+"1"; // Após ele identificar uma string, não consegue mais realizar soma
        System.out.println(concatenação);

        concatenação = "1"+(1+1+1); // Neste é possível realizar a soma pois ela está em evidência ()
        System.out.println(concatenação);

        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);

        int negativo = 7;
        negativo = - negativo; // Deixar a variável negativa
        System.out.println(negativo);

        negativo = negativo * -1; // Deixar a variável positiva
        System.out.println(negativo);

        int somar = 10;
        somar = ++ somar; // Somar em + 1 unidade na variável
        System.out.println(somar);

        somar = -- somar;
        System.out.println(somar);
    }
}
