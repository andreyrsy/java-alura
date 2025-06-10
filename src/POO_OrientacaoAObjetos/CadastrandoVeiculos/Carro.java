package POO_OrientacaoAObjetos.CadastrandoVeiculos;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;

    public Carro(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public int getAno() {
        return ano;
    }

    public void exigirInforamcoes(){
        System.out.printf("Veículo cadastrado:\nModelo: %s\nPlaca: %s\nAno: %d", modelo, placa, ano);
    }
}
