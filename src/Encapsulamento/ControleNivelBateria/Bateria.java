package Encapsulamento.ControleNivelBateria;

public class Bateria {
    private int nivelBateria;

    public int getNivelBateria() {
        return nivelBateria;
    }

    public String statusBateria(){
        if(nivelBateria <=20){
            return "Status: Bateria fraca";
        } else if(nivelBateria <= 80){
            return "Status: Bateria ok";
        } else {
            return "Status: Bateria cheia";
        }
    }

    public void setNivelBateria(int nivelBateria) {
        if(nivelBateria < 0 || nivelBateria > 100){
            System.out.println("Inválido! Digite um valor entre 0 e 100");
        } else {
            this.nivelBateria = nivelBateria;
        }
    }
}
