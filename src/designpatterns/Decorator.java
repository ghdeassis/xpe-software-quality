package designpatterns;

// Componente base
interface Pizza {
    // Método para obter a descrição da pizza
    String getDescription();

    // Método para obter o custo da pizza
    double getCost();
}

// Implementação base
class CheesePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza de Queijo";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}

// Decorator abstrato
abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza; // Objeto que será decorado

    // Construtor recebe a pizza que será decorada
    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    // Implementação da descrição da pizza (delega para a pizza decorada)
    public String getDescription() {
        return pizza.getDescription();
    }

    // Implementação do custo da pizza (delega para a pizza decorada)
    public double getCost() {
        return pizza.getCost();
    }
}

// Implementação de um decorador específico
class TomatoSauce extends ToppingDecorator {
    // Construtor recebe a pizza que será decorada
    public TomatoSauce(Pizza pizza) {
        super(pizza);
    }

    // Adiciona a descrição do molho de tomate à descrição da pizza
    // (herdada do decorator abstrato)
    public String getDescription() {
        return pizza.getDescription() + ", molho de tomate";
    }

    // Adiciona o custo do molho de tomate ao custo da pizza
    // (herdada do decorator abstrato)
    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}

// Implementação de outro decorador específico
class Ham extends ToppingDecorator {
    // Construtor recebe a pizza que será decorada
    public Ham(Pizza pizza) {
        super(pizza);
    }

    // Adiciona a descrição do presunto à descrição da pizza
    // (herdada do decorator abstrato)
    public String getDescription() {
        return pizza.getDescription() + ", presunto";
    }

    // Adiciona o custo do presunto ao custo da pizza
    // (herdada do decorator abstrato)
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}

class Decorator {
    public static void main (String[] args) {
        //Cria uma pizza base
        Pizza pizza = new CheesePizza();

        // Pizza de Queijo - $10.0
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());

        // Adicionando molho de tomate à pizza
        Pizza pizzaComMolho = new TomatoSauce(pizza);

        // Pizza de Queijo, molho de tomate - $11.0
        System.out.println(pizzaComMolho.getDescription() + " - $" + pizzaComMolho.getCost());
    }
}