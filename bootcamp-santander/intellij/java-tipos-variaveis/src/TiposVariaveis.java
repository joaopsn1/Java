public class TiposVariaveis {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");

        double salarioMinimo = 2.500;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Cast

        final double VALOR_DE_PI = 3.14; // Precisa do "final" para não permitir alterar a variável 
    }
}
