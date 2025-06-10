package POO_OrientacaoAObjetos.ResumoLivro;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public void exibirResumo(){
        System.out.printf("\"%s\" de %s com %d páginas%n", titulo, autor, paginas);
    }
}
