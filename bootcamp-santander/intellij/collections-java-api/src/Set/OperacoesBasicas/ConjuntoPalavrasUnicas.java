package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasSet.isEmpty()) {
            if (!palavrasSet.contains(palavra)) {
                palavrasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vaziO!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasSet.isEmpty()) {
            System.out.println(palavrasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        palavras.adicionarPalavra("Java");
        palavras.adicionarPalavra("Python");
        palavras.adicionarPalavra("JavaScript");
        palavras.adicionarPalavra("Python");
        palavras.adicionarPalavra("C++");
        palavras.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        palavras.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        palavras.removerPalavra("Python");
        palavras.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        palavras.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + palavras.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + palavras.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        palavras.exibirPalavrasUnicas();
    }
}
