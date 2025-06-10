package POO_OrientacaoAObjetos.RelatorioProduto;

public class Main {
    public static void main(String[] args) {
/*
Imagine que você é responsável pelo controle de estoque de uma loja de informática que está expandindo
seus negócios. Com o aumento da demanda, é importante manter um registro organizado e preciso de todos os
produtos disponíveis. Sua tarefa é criar um sistema que armazene as informações de cada item e gere um
relatório para facilitar a gestão do estoque.

Sua tarefa é criar uma classe que:

Represente um produto com os atributos nome, preço e quantidade.
Implemente um metodo que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.

Exemplo de entrada:

nome = "Mouse Gamer"
preco = 159.9
quantidade = 25

Saída esperada:

Produto: Mouse Gamer
Preço: R$ 159,90
Quantidade em estoque: 25
*/
        String nome = "Mouse Gamer";
        double preco = 159.9;
        double quantidade = 25;

        Produto produto1 = new Produto();

        produto1.nome = nome;
        produto1.preco = preco;
        produto1.quantidade = quantidade;

        produto1.exigirInformacoes();

        nome = "Air Fryer";
        preco = 359.9;
        quantidade = 18;
        Produto produto2 = new Produto();

        produto2.nome = nome;
        produto2.preco = preco;
        produto2.quantidade = quantidade;

        produto2.exigirInformacoes();

    }
}
