package Encapsulamento.CadastroProdutosValidacao;

public class Main {
    public static void main(String[] args) {
/*
Imagine que você é responsável pelo módulo de cadastro de um sistema de gestão de estoque.
Durante o processo de entrada de mercadorias, é crítico evitar que produtos sejam registrados com
valores inconsistentes, pois isso poderia causar problemas financeiros e operacionais.

Seu desafio é implementar uma proteção que impeça a atribuição de preços negativos aos produtos,
garantindo que o sistema mantenha dados confiáveis.

Crie um programa que:
• Defina uma classe para representar um produto com nome e preço.
• Valide se o preço é um valor não negativo antes de atualizá-lo.
• Seo valor for negativo, então deverá ser redefinido para 0.00.
• Exiba uma mensagem quando a validação falhar.
• Por fim, exiba uma mensagem com os dados do produto.
*/

        Produto produto = new Produto();

        produto.setNome("Mouse");
        produto.setPreco(1);

        if(produto.getPreco() > 0){
        System.out.printf("Nome: %s\n", produto.getNome());
        System.out.printf("Preço: %.2f\n", produto.getPreco());
        }else{
            System.out.println("Preço Inválido");
            System.out.printf("Nome: %s\n", produto.getNome());
            produto.setPreco(0);
            System.out.printf("Preço: %.2f\n", produto.getPreco());
        }


    }
}
