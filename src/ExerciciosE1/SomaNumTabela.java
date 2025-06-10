package ExerciciosE1;

public class SomaNumTabela {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};

        int soma = 0;

        for(int somaValor : valores){
            soma += somaValor;
        }
        System.out.println("A soma de todos números: "+ soma);
    }
}
