public class SistemaCadastro {
    public static void main(String[] args) {
        //Criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("123", "Marcos");

        //Definimos o endereço de Marcos
        marcos.setEndereco("Rua das Marias");

        //E como definir o nome e cpf do Marcos?

        //Imprimindo o Marcos sem o nome e CPF

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
