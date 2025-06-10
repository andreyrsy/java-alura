package POO_OrientacaoAObjetos.ResumoLivro;

public class Main {
    public static void main(String[] args) {
/*
Imagine que você está criando um sistema de catalogação para uma biblioteca. Seu objetivo é desenvolver uma
estrutura que armazene dados de obras literárias e as exiba em um formato padronizado, facilitando a consulta por outros leitores.

Crie um programa que:

Defina uma classe com os atributos título, autor e páginas.
Implemente um metodo que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.

*/

        String titulo = "The Great Gatsby";
        String autor = "F. Scott Fitzgerald";
        int paginas = 290;

        Livro livroGatsby = new Livro();
        livroGatsby.titulo = titulo;
        livroGatsby.autor = autor;
        livroGatsby.paginas = paginas;

        livroGatsby.exibirResumo();
    }
}
