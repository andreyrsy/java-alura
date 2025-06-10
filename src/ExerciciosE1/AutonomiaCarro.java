package ExerciciosE1;

public class AutonomiaCarro {
    public static void main(String[] args) {
/*
Você está planejando uma viagem de carro e deseja calcular quantos quilômetros poderá percorrer com o
combustível disponível no tanque. Para isso, você precisa considerar:

O consumo médio do veículo (km/l)
A capacidade total do tanque de combustível (litros)
A quantidade de combustível disponível no momento (litros)
A distância da viagem planejada (km)
Com essas informações, o programa deverá calcular:

A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
A autonomia atual, baseada na quantidade de combustível disponível.
Se a quantidade de combustível atual será suficiente para percorrer um determinado trajeto informado pelo usuário.
*/


        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double tanqueCheio = capacidadeTanque * consumoMedio;
        System.out.println("Autonomia máxima do veículo: " +tanqueCheio + " km");

        double autonomiaAtual = combustivelAtual * consumoMedio;
        System.out.println("Autonomia atual: " + autonomiaAtual + " km\n");

        if(distanciaViagem < autonomiaAtual){
            System.out.println("Autonomia: " + autonomiaAtual + " km \nDistância: " + distanciaViagem + "\nConsegue chegar ao destino: Sim");
        } else {
            System.out.println("Autonomia: " + autonomiaAtual + " km \nDistância: " + distanciaViagem + "\nVocê conseguirá completar a viagem sem precisar abastecer.");
        }
    }
}
