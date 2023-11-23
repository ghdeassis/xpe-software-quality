package designpatterns;

public class Singleton {
    // Define a variável que armazena a única instância da classe
    private static Singleton instance;
    private Integer a;

    // Define o construtor privado para impedir a
    // criação de instâncias fora da classe
    private Singleton() {}

    // Define o método que retorna a única instância da classe
    public static Singleton getInstance() {
        // Verifica se a variável instance ainda não foi inicializada
        if (instance == null) {
            // Se não foi, cria uma nova instância da classe
            // e a atribui a variável instance
            instance = new Singleton();
            instance.a = 10;
        }
        // Retorna a instância existente ou recém-criada
        return instance;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }
}

class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // As duas variáveis contém a mesma instância da classe designPatterns.Singleton
        System.out.println(obj1 == obj2); // true
        System.out.println(obj1.getA()); // 10

        // Ao alterar a variável "a" no obj2, o valor também é alterado
        // no obj1 pois eles fazem referëncia a mesma instância
        obj2.setA(20);

        System.out.println(obj1.getA()); // 20
        System.out.println(obj2.getA()); // 20
    }
}

