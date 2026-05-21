import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<FuncionarioPadrao> funcionarios = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Funcionário Padrão");
            System.out.println("2 - Cadastrar Funcionário Comissionado");
            System.out.println("3 - Cadastrar Funcionário Produção");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n=== Funcionário Padrão ===");

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("ID Funcionário: ");
                    int id = sc.nextInt();

                    FuncionarioPadrao funcionarioPadrao =
                            new FuncionarioPadrao(
                                    nome,
                                    cpf,
                                    FuncionarioPadrao.salario_Base,
                                    id
                            );

                    funcionarios.add(funcionarioPadrao);

                    System.out.println("Funcionário padrão cadastrado!");
                    break;

                case 2:

                    System.out.println("\n=== Funcionário Comissionado ===");

                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("CPF: ");
                    cpf = sc.nextLine();

                    System.out.print("ID Funcionário: ");
                    id = sc.nextInt();

                    System.out.print("Percentual da comissão: ");
                    double percentual = sc.nextDouble();

                    System.out.print("Total de vendas: ");
                    int vendas = sc.nextInt();

                    FuncionarioComissionado funcionarioComissionado =
                            new FuncionarioComissionado(
                                    nome,
                                    cpf,
                                    FuncionarioPadrao.salario_Base,
                                    id,
                                    percentual,
                                    vendas
                            );

                    funcionarios.add(funcionarioComissionado);

                    System.out.println("Funcionário comissionado cadastrado!");
                    break;

                case 3:

                    System.out.println("\n=== Funcionário Produção ===");

                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("CPF: ");
                    cpf = sc.nextLine();

                    System.out.print("ID Funcionário: ");
                    id = sc.nextInt();

                    System.out.print("Valor por peça: ");
                    double valorPeca = sc.nextDouble();

                    System.out.print("Quantidade produzida: ");
                    double quantidade = sc.nextDouble();

                    FuncionarioProducao funcionarioProducao =
                            new FuncionarioProducao(
                                    nome,
                                    cpf,
                                    FuncionarioPadrao.salario_Base,
                                    id,
                                    valorPeca,
                                    quantidade
                            );

                    funcionarios.add(funcionarioProducao);

                    System.out.println("Funcionário produção cadastrado!");
                    break;

                case 4:

                    System.out.println("\n===== FOLHA DE PAGAMENTO =====");

                    System.out.println("Total de pessoas cadastradas: "
                            + funcionarios.size());

                    for (FuncionarioPadrao funcionario : funcionarios) {

                        System.out.println("\nNome: "
                                + funcionario.getNome());

                        System.out.println("Matrícula: "
                                + funcionario.getIdFuncionario());

                        System.out.println("Salário Final: "
                                + funcionario.calcularSalarioFinal());

                        // verifica se é comissionado
                        if (funcionario instanceof FuncionarioComissionado) {

                            FuncionarioComissionado fc =
                                    (FuncionarioComissionado) funcionario;

                            System.out.println("Comissão: "
                                    + fc.calcularComissao());
                        }

                        // verifica se é produção
                        if (funcionario instanceof FuncionarioProducao) {

                            FuncionarioProducao fp =
                                    (FuncionarioProducao) funcionario;

                            System.out.println("Bônus Produção: "
                                    + fp.calculoBonus());
                        }
                    }

                    break;

                case 0:

                    System.out.println("Sistema encerrado!");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}