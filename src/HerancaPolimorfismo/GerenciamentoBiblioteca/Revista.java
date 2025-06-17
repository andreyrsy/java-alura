package HerancaPolimorfismo.GerenciamentoBiblioteca;

public class Revista extends Midia{
    private int edicao;
    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public void exibirInfo(){
        System.out.printf("Código: %s | Livro: %s - Revista: %s\n", codigoLivro(), getTitulo(), this.edicao);
    }
}
