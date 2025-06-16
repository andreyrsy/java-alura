package Encapsulamento.AvaliacaoFilmes;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private ArrayList<Integer> avaliacoes;
//    private double notaAvaliacao;

    public Filme(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int nota) {
        if(nota >= 1 && nota <= 5) {
            avaliacoes.add(nota);
        }else{
            System.out.println("Nota inválida. Por favor, insira um valor entre 1 e 5");
        }
    }

    public double calcularMedia(){
        int soma = 0;
        for(int nota : avaliacoes){
            soma += nota;
        }
        return (double) soma / avaliacoes.size();
    }
}

