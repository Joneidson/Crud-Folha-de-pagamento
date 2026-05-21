public class FuncionarioProducao extends FuncionarioPadrao {

    private double valorPorPeca;
    private double quantidadeProduzida;

    public FuncionarioProducao(String name,
                               String cpf,
                               double salario_Base,
                               int idFuncionario,
                               double valorPorPeca,
                               double quantidadeProduzida) {

        super(name, cpf, salario_Base, idFuncionario);

        this.valorPorPeca = valorPorPeca;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public double getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public double getValorPorPeca() {
        return valorPorPeca;
    }

    public double calculoBonus() {
        // OBS; NUCA PODE COLOCAR O MESMO NOME DO METODO DENTRO DO METODO
        // SE FOR PRECISO CRIAR UMA VARIAVEL!!

        double bonus = valorPorPeca * quantidadeProduzida; // crio uma variavel pra receber o valor do metodo
        double percentualExtra = 0.20;

        if (quantidadeProduzida > 100) { // faço a condição
            bonus = bonus + (bonus * percentualExtra); // faço a operaçao da conçao
        }
        return bonus; // retorno o valor do método
    }

    @Override
    public double calcularSalarioFinal() {
        return salario_Base + calculoBonus();
    }

}
