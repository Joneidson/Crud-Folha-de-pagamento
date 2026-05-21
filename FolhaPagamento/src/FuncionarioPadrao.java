public class FuncionarioPadrao {
    private String nome;
    private String cpf;
    protected static final double salario_Base = 2000;
    private int idFuncionario;


    // Construtor
    public FuncionarioPadrao(String nome,
                             String cpf,
                             double salario_Base,
                             int idFuncionario) {

        this.nome = nome;
        this.cpf = cpf;
        this.idFuncionario = idFuncionario;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdFuncionario() {
        return this.idFuncionario;
    }

    public double calcularSalarioFinal() {
        return salario_Base;
    }

}
