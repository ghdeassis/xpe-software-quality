package designpatterns;

// A interface designPatterns.Shape define o contrato que as
// classes designPatterns.Square e designPatterns.RectangleAdapter devem seguir
interface Shape {
    void draw();
}

// A classe designPatterns.Square implementa a interface
// designPatterns.Shape e define o método drawSquare()
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Quadrado.");
    }
}

// A classe designPatterns.Rectangle não implementa a interface designPatterns.Shape,
// pois ela já existe e não pode ser modificada para este exemplo
class Rectangle {
    public void drawRectangle() {
        System.out.println("Retângulo.");
    }
}

// A classe designPatterns.RectangleAdapter também implementa a interface
// designPatterns.Shape e utiliza a composição para "adaptar" a classe designPatterns.Rectangle
class RectangleAdapter implements Shape {
    // A classe designPatterns.Rectangle é referenciada dentro da classe
    // designPatterns.RectangleAdapter através de um atributo
    private Rectangle rectangle;

    // No construtor da classe designPatterns.RectangleAdapter, é passado um
    // objeto designPatterns.Rectangle como parâmetro para ser "adaptado"
    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    // O método draw() da interface designPatterns.Shape é implementado
    // chamando o método drawRectangle() da classe designPatterns.Rectangle
    @Override
    public void draw() {
        rectangle.drawRectangle();
    }
}

class Adapter {
    // No método main, é criado um objeto designPatterns.Square,
    // um objeto designPatterns.Rectangle e um objeto designPatterns.RectangleAdapter
    // Em seguida, são chamados os métodos draw()
    // de cada um, e a saída é impressa no console
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Shape rectangleAdapter = new RectangleAdapter(rectangle);

        square.draw();
        rectangle.drawRectangle();
        rectangleAdapter.draw();
    }

}

