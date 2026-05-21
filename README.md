Sistema de Folha de Pagamento em Java
📌 Descrição

Este projeto foi desenvolvido em Java utilizando os princípios de Programação Orientada a Objetos (POO).

O sistema permite:

Cadastrar funcionários
Diferenciar tipos de colaboradores
Calcular salários automaticamente
Gerar folha de pagamento
🚀 Funcionalidades
✅ Funcionário Padrão

Recebe apenas o salário base da empresa.

✅ Funcionário Comissionado

Recebe:

Salário base
Comissão sobre vendas
Fórmula:
comissao = vendas * (percentual / 100)
✅ Funcionário de Produção

Recebe:

Salário base
Bônus por produtividade
Fórmula:
bonus = valorPorPeca * quantidadeProduzida
🛠 Tecnologias utilizadas
Java
Programação Orientada a Objetos
ArrayList
Herança
Polimorfismo
Encapsulamento
Sobrescrita de métodos (@Override)
📂 Estrutura do Projeto
📁 projeto
 ├── Main.java
 ├── FuncionarioPadrao.java
 ├── FuncionarioComissionado.java
 └── FuncionarioProducao.java
🧠 Conceitos de POO aplicados
🔹 Herança

As classes:

FuncionarioComissionado
FuncionarioProducao

herdam atributos e métodos da classe:

FuncionarioPadrao
🔹 Polimorfismo

Todos os funcionários são armazenados em:

ArrayList<FuncionarioPadrao>

permitindo tratar diferentes tipos de funcionários de forma unificada.

🔹 Encapsulamento

Os atributos das classes foram definidos como private, garantindo maior segurança e organização do código.

🔹 Sobrescrita de métodos

Cada tipo de funcionário possui sua própria implementação do método:

calcularSalarioFinal()

utilizando @Override.

💰 Salário Base

O salário base da empresa foi definido como constante:

protected static final double salario_Base = 2000;

Valor:

R$ 2.000,00
▶️ Como executar
1️⃣ Compilar os arquivos
javac *.java
2️⃣ Executar o programa
java Main
📋 Menu do Sistema
1 - Cadastrar Funcionário Padrão
2 - Cadastrar Funcionário Comissionado
3 - Cadastrar Funcionário Produção
4 - Gerar Folha de Pagamento
0 - Sair
📌 Exemplo de saída
===== FOLHA DE PAGAMENTO =====

Nome: Maria
Matrícula: 123
Salário Final: 2000.0

Nome: João
Matrícula: 456
Comissão: 500.0
Salário Final: 2500.0
👩‍💻 Autora

Anne Caroline das Virgens de Jesus

📚 Objetivo acadêmico

Projeto desenvolvido para praticar:

Estruturas de repetição
Programação Orientada a Objetos
Herança
Polimorfismo
Organização de classes em Java
