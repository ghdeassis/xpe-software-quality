package designpatterns;

// Classe abstrata que define a interface para criar objetos
abstract class LogisticsFactory {
    public abstract Transport createTransport();
}

// Subclasse que implementa a lógica para criar um objeto específico
class TruckFactory extends LogisticsFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

// Subclasse que implementa a lógica para criar outro objeto específico
class ShipFactory extends LogisticsFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

// Classe que representa um transporte genérico
abstract class Transport {
    public abstract void deliver();
}

// Subclasse que representa um caminhão
class Truck extends Transport {
    @Override
    public void deliver() {
        System.out.println("Entrega de caminhão realizada com sucesso!");
    }
}

// Subclasse que representa um navio
class Ship extends Transport {
    @Override
    public void deliver() {
        System.out.println("Entrega de navio realizada com sucesso!");
    }
}

// Exemplo de uso do Factory Method
class FactoryMethod {
    public static void main(String[] args) {
        // Cria uma instância do designPatterns.TruckFactory
        LogisticsFactory truckFactory = new TruckFactory();

        // Cria uma instância do designPatterns.ShipFactory
        LogisticsFactory shipFactory = new ShipFactory();

        // Cria um transporte usando o designPatterns.TruckFactory
        Transport truck = truckFactory.createTransport();
        truck.deliver(); // Entrega de caminhão realizada com sucesso!

        // Cria um transporte usando o designPatterns.ShipFactory
        Transport ship = shipFactory.createTransport();
        ship.deliver(); // Entrega de navio realizada com sucesso!
    }
}

