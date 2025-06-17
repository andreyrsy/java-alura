package Encapsulamento.RegistroDeNotas;

import java.util.ArrayList;

public class Disciplina {
    private String disciplina;
    private ArrayList<Double> notas;

    public Disciplina(String disciplina) {
        this.disciplina = disciplina;
        this.notas = new ArrayList<>();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void adicionarNota(double nota) {
        if(nota >= 0 && nota <= 10){
            notas.add(nota);
        }else{
            System.out.println("Nota inválida ignorada: " + nota);
        }
    }

    public int contarNotasValidas(){
        return notas.size();
    }

    public double calcularMedia(){
        if(notas.isEmpty()) return 0;

        double soma = 0;

        for(double nota : notas){
            soma += nota;
        }
        return soma / notas.size();
    }
}
