package POO_OrientacaoAObjetos.CadastrandoVeiculos;

public class Main {
    public static void main(String[] args) {
/*
Você está desenvolvendo um sistema para uma oficina mecânica registrar os veículos
que chegam para manutenção. Cada carro precisa ser identificado com algumas informações
 para o controle interno.

Crie um programa que:

Defina uma classe com os atributos modelo, placa e ano.
Defina uma instancia dessa classe através do metodo construtor.
Exiba as informações do veículo no console.

*/
        Carro carro = new Carro("Gol", "JFP-3281", 2023);
        carro.exigirInforamcoes();

    }
}
