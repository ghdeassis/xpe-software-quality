package designpatterns;

// Interface para definir os algoritmos
interface CalculatorStrategy {
    public int execute(int a, int b);
}

// Algoritmos concretos
class Add implements CalculatorStrategy {
    // Implementação do algoritmo de adição
    public int execute(int a, int b) {
        return a + b;
    }
}

class Subtract implements CalculatorStrategy {
    // Implementação do algoritmo de subtração
    public int execute(int a, int b) {
        return a - b;
    }
}

// Cliente que utiliza os algoritmos
class Calculator {
    private CalculatorStrategy strategy;

    public Calculator(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    // Método que utiliza o algoritmo selecionado
    public int calculate(int a, int b) {
        return strategy.execute(a, b);
    }
}

// Exemplo de uso
class MainStrategy {
    public static void main(String[] args) {
        // Cria uma instância da calculadora com o algoritmo de adição
        Calculator calculator = new Calculator(new Add());
        int result = calculator.calculate(5, 3);
        System.out.println(result); // 8

        // Cria uma instância da calculadora com o algoritmo de subtração
        calculator = new Calculator(new Subtract());
        result = calculator.calculate(5, 3);
        System.out.println(result); // 2
    }
}
