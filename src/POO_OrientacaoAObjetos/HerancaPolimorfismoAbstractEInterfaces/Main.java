package POO_OrientacaoAObjetos.HerancaPolimorfismoAbstractEInterfaces;

public class Main {
    public static void main(String[] args) {
        /*
        Funcionario funcionario = new Funcionario("João", 8500);
        funcionario.setCargo("Desenvolvedor");

        System.out.println("Funcionário tem o cargo " + funcionario.getCargo());
        System.out.println("Funcionário tem o nome " + funcionario.getNome());
        System.out.println("Funcionário tem o salário " + funcionario.getSalario());

        funcionario.reajustarSalario(5);
        funcionario.reajustarSalario(10);
        funcionario.exigirInformacoes();
*/

        Funcionario gerente = new Gerente("Mario", 15000);
        ((Gerente)gerente).setBonus(1000);
        gerente.exigirInformacoes();
        gerente.reajustarSalario(2);
        ((Gerente) gerente).aprovarProjeto("Uso de IA nos códigos Java");

        Funcionario desenvolvedor = new Desenvolvedor("Gabriel", 12000, "Backend Java");
        desenvolvedor.reajustarSalario();
        desenvolvedor.exigirInformacoes();

    }
}
