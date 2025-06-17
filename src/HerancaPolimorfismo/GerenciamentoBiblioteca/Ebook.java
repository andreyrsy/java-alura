package HerancaPolimorfismo.GerenciamentoBiblioteca;

public class Ebook extends Midia{
    private String formato;
    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    public void exibirInfo(){
        System.out.printf("Código: %s | Livro: %s - Ebook: %s\n", codigoLivro(), getTitulo(), this.formato);
    }
}
