package designpatterns;

import java.util.ArrayList;
import java.util.List;

// Interface para os observadores
interface Observer {
    public void update(int value);
}

// Objeto observável
class Observable {
    private List<Observer> observers = new ArrayList<>();
    private int value;

    // Adiciona um novo observador
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove um observador existente
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Define o novo valor e notifica os observadores
    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    // Notifica todos os observadores registrados
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }
}

// Observador
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    // Método que é chamado quando o valor do objeto observável é alterado
    public void update(int value) {
        System.out.println(name + " foi notificado. Novo valor: " + value);
    }
}

// Exemplo de uso
class MainObserver {
    public static void main(String[] args) {
        // Cria uma instância do objeto observável
        Observable observable = new Observable();
        // Cria duas instâncias do observador
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        // Adiciona os observadores ao objeto observável
        observable.addObserver(observer1);
        observable.addObserver(observer2);

        // Define o novo valor no objeto observável
        observable.setValue(10);

        // Observer 1 foi notificado. Novo valor: 10
        // Observer 2 foi notificado. Novo valor: 10
    }
}

