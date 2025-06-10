package POO_OrientacaoAObjetos.RelatorioProduto;

public class Produto {
    String nome;
    double preco;
    double quantidade;

    public void exigirInformacoes(){
        System.out.printf("Produto: %s \nPreço: R$%.2f\nQuantidade em estoque: %.0f\n\n", nome, preco, quantidade);
    }
}
