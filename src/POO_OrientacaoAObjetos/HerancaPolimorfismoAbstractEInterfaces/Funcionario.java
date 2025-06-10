package POO_OrientacaoAObjetos.HerancaPolimorfismoAbstractEInterfaces;

public abstract class Funcionario {
    protected String nome;
    protected String cargo;
    protected double salario;
    private int controleReajuste = 0;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void exigirInformacoes() {
        System.out.printf("Funcionario %s - Cargo: %s - Salario: %.2f\n", nome, cargo, salario);
    }

    public void reajustarSalario(double percentual) {
        if(controleReajuste >= 1){
            System.out.println("\nNão pode fazer reajustes.");
        }else{
            controleReajuste++;
            salario += salario * (percentual / 100);
            System.out.printf("Novo salário de %s é R$%.2f ", nome, salario);
        }
    }

    public void reajustarSalario(){
        salario += 500;
        System.out.printf("\nSalário com dissídio de %s é R$%.2f ", nome, salario);
    }

    public abstract void calcularPLR();
}
