package badsmells;

abstract class Funcionario {
    private String nome;
    private String endereco;
    private double salario;

    // Construtor, getters e setters

    public double calcularSalario() {
        // Lógica para cálculo do salário
        return salario;
    }

    public void registrarPonto() {
        // Lógica para registrar o ponto
    }

    public abstract void realizarTarefa();

    // Outros métodos relevantes para todos os funcionários
}

class Desenvolvedor extends Funcionario {
    // Atributos e métodos específicos para desenvolvedores

    @Override
    public void realizarTarefa() {
        // Implementação específica para desenvolvedores
    }
}

class Gerente extends Funcionario {
    // Atributos e métodos específicos para gerentes

    @Override
    public void realizarTarefa() {
        // Implementação específica para gerentes
    }
}
