package lanchonete;

public class Cozinheiro {
    //Pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER");
    }
    //Pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
    //Pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBÚGUER");
    }

    public void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }

    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }

    public void selecionarIngredientesVitamina() {
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }

    public void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    public void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }

    public void fritarIngredientes() {
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
