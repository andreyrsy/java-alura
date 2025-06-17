package HerancaPolimorfismo.GerenciamentoBiblioteca;

public class Main {
    public static void main(String[] args) {
/*
Imagine que você está desenvolvendo um sistema para uma biblioteca que precisa catalogar
diferentes tipos de mídias: livros, revistas e e-books. Cada mídia possui informações especiíficas,
como título e ano de publicação, mas algumas têm características únicas, como autor (livros), edição
(revistas) ou formato (e-books). Seu programa deve ser capaz de exibir esses dados para facilitar a
consulta pelos bibliotecários.
Crie um programa que:
Defina uma classe Midia com os atributos título e ano de publicação.
Defina um metodo que gere um código no formato “LIB- + os três primeiros caracteres do título
+ ano de publicação", por exemplo:
Código: LIB-O H1937 | Livro: "O Hobbit" - Autor: J.R.R. Tolkien
Crie as classes Livro, Revista e Ebook, todas herdando de Midia, adicionando:
Livro: atributo autor.
Revista: atributo edição.
: atributo formato.
Cadastre uma mídia de cada tipo.
Exiba o código e os detalhes de cada mídia usando o método exibirInfo.
*/
        Livro livro = new Livro("O Hobbit", 1937, "J.R.R. Tolkien");
        Revista revista = new Revista("National Geographic", 2023, 243);
        Ebook ebook = new Ebook("Clean Code", 2008, "PDF");

        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();

    }
}
