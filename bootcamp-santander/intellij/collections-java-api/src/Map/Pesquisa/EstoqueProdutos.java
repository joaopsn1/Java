package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(produtoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!produtoMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : produtoMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        //Exibe o estoque vazio
        estoqueProdutos.exibirProdutos();

        //Adiciona produtos ao estoque
        estoqueProdutos.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoqueProdutos.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoqueProdutos.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoqueProdutos.adicionarProduto(4L, "Teclado", 2, 40.0);

        //Exibe os produtos no estoque
        estoqueProdutos.exibirProdutos();

        //Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());

        //Obtém e exibe o produto mais caro
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

        //Obtém e exibe o produto mais barato
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

        //Obtém e exibe o produto com a maior quantidade em valor no estoque
        System.out.println("Produto com maior quantidade em valor no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
