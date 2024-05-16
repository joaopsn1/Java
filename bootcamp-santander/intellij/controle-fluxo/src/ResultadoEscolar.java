public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7)
            System.out.println("APROVADO");
        else if (nota >= 5 && nota < 7)
            System.out.println("RECUPERAÇÃO");
        else
            System.out.println("REPROVADO");

        /*
        CONDIÇÂO TERNÁRIA:
        CENÁRIO 1:
            int nota = 7;
		    String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		    System.out.println(resultado);

		CENÁRIO 2:
		    int nota = 6;
		    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		    System.out.println(resultado);
        */
    }
}
