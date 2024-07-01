package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Alunos alunosParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Alunos a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunosParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunosParaRemover);
        } else {
            System.out.println("A lista de alunos está vazia!");
        }

        if (alunosParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public Set<Alunos> exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota() {
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public Set<Alunos> exibirAlunos() {
        return alunosSet;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123, 8d);
        gerenciadorAlunos.adicionarAluno("Nicoli", 124, 8.5d);
        gerenciadorAlunos.adicionarAluno("Anna", 222, 10d);
        gerenciadorAlunos.adicionarAluno("Lucas", 457, 6d);

        System.out.println(gerenciadorAlunos.alunosSet);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(457);

        System.out.println(gerenciadorAlunos.exibirAlunos());
    }
}
