public class ExemploForArray {
    public static void main(String[] args) {
        //Em arrays o índice inicia em ZERO
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // Uma forma mais abreviada
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

        /*
        for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x= " + x + " é " + alunos[x]);
        }
        */
    }
}
