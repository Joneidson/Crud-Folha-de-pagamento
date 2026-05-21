public class FuncionarioComissionado extends FuncionarioPadrao {

    private double percentualComissao;
    private int totalVendas;

    // Construtor da Classe FuncionarioComissionado
    public FuncionarioComissionado(String nome,
                                   String cpf,
                                   double salario_Base,
                                   int idFuncionario,
                                   double percentualComissao,
                                   int totalVendas) {

        // chama o super pra pegar os atributos da classe pai "funcionariopadrao"
        super(nome, cpf, salario_Base, idFuncionario);

        this.percentualComissao = percentualComissao;
        this.totalVendas = totalVendas;
    }

    public double calcularComissao() {
        return totalVendas  * (percentualComissao/100);
    }

    @Override
    public double calcularSalarioFinal() {
        return salario_Base + calcularComissao();
    }
}
