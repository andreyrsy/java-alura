package Encapsulamento.ControleSaldoBancario;

public class Conta {
    private String titular;
    private double saldoInicial;

    public Conta(String titular) {
        this.titular = titular;
    }

    void depositar(double valor){
        if(valor > 0){
            this.saldoInicial += valor;
            System.out.printf("Valor depositado com sucesso de: R$%2.2f\n", valor);
        }else{
            System.out.println("Valor inválido!");
        }

    }

    public double sacar(double valor){
        if (valor <= this.saldoInicial){
            this.saldoInicial -= valor;
            System.out.printf("Saque realizado com sucesso de: R$%.2f\n", this.saldoInicial);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
        return this.saldoInicial;
    }

    public double exibirSaldo(){
        System.out.println("\nSaldo atual de " + this.titular + ": " + this.saldoInicial);
        return this.saldoInicial;
    }
}
